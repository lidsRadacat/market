package com.radacat.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.service.AdminService;
import com.radacat.service.UserService;
import com.radacat.utils.LoggerUtil;


/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午1:59:18
 * @version: V1.0
 */
@Controller
public class ShiroContrller extends BaseController{

	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
//	@ApiOperation(value="用户登录", notes="")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "username", value = "用户手机号", required = true, dataType = "String"),
//            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String"),
//            @ApiImplicitParam(name = "rememberMe", value = "是否记住登录", required = false, dataType = "String"),
//            @ApiImplicitParam(name = "validate", value="图片验证码",required = true,dataType = "String")
//    })
	@RequestMapping(value="/api/login",method=RequestMethod.POST,consumes="application/x-www-form-urlencoded",produces="application/json")
	@ResponseBody
	public RestApi<String> login(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "validate", required = true) String validate,
			@RequestParam(value = "remeberMe",required = false) String remeberMe,
			HttpSession session){
		System.out.println(username);
		System.out.println(password); 
		System.out.println(remeberMe); 
		System.out.println(validate);
//		if(validate == null || validate.trim().equals("") || !validate.equals(session.getAttribute("code"))){
//			return new RestApi<>(StatusCode._40000.getCode(),StatusCode._40000.getMessage());
//		}
		UsernamePasswordToken token = null;
		if(remeberMe == null || remeberMe.trim().equals("")){
			token = new UsernamePasswordToken(username, password);			
		}
		token = new UsernamePasswordToken(username, password,true);
		//获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();  
        try { 
            //在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查  
            //每个Realm都能在必要时对提交的AuthenticationTokens作出反应  
            //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法  
        	LoggerUtil.info("对用户[" + username + "]进行登录验证..验证开始");  
            currentUser.login(token);
            LoggerUtil.info("对用户[" + username + "]进行登录验证..验证通过");
        }catch(UnknownAccountException uae){  
        	LoggerUtil.info("对用户[" + username + "]进行登录验证..验证未通过,未知账户");  
        	return new RestApi<>(StatusCode._40001.getCode(),StatusCode._40001.getMessage());
        }catch(IncorrectCredentialsException ice){  
        	LoggerUtil.info("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");  
        	return new RestApi<>(StatusCode._40002.getCode(),StatusCode._40002.getMessage());
        }catch(LockedAccountException lae){  
        	LoggerUtil.info("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");  
        	return new RestApi<>(StatusCode._40003.getCode(),StatusCode._40004.getMessage());
        }catch(ExcessiveAttemptsException eae){  
            LoggerUtil.info("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");  
            return new RestApi<>(StatusCode._40004.getCode(),StatusCode._40004.getMessage());
        }catch(AuthenticationException ae){  
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景  
        	LoggerUtil.info("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");  
            ae.printStackTrace();  
            return new RestApi<>(StatusCode._40005.getCode(),StatusCode._40005.getMessage());
        }
        //验证是否登录成功  
        if(currentUser.isAuthenticated()){
        	LoggerUtil.info("用户[" + username + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
        	setUser(session, userService.findUserVO(username));
            return new RestApi<>(StatusCode._20000.getCode());
        }else{
            token.clear();
            return new RestApi<>(StatusCode._10000.getCode(),StatusCode._10000.getMessage());
        }  
	}
	
//	@ApiOperation(value="用户退出", notes="")
	@RequestMapping(value="/logout",method=RequestMethod.GET)  
    public String logout(HttpSession session){ 
		//使用权限管理工具进行用户的退出，跳出登录，给出提示信息
		removeUser(session);
        SecurityUtils.getSubject().logout();  
        return "user/login";
    }
	
//	@ApiOperation(value="用户没有权限", notes="")
	@RequestMapping("/403")
	@ResponseBody
	public RestApi<String> unauthorizedRole(){
		LoggerUtil.info("------没有权限-------");
		return new RestApi<>(StatusCode._40006.getCode(),StatusCode._40006.getMessage());
	}
}
