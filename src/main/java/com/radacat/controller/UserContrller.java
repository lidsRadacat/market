package com.radacat.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.domain.User;
import com.radacat.exception.MyJsonCheckedException;
import com.radacat.service.MobileValidateCodeService;
import com.radacat.service.UserService;
import com.radacat.utils.IPv4Util;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午1:41:19
 * @version: V1.0
 */
@RestController
public class UserContrller {
	
	@Autowired
	UserService userService;
	
	@Autowired
	MobileValidateCodeService mobileValidateCodeService;
	
	@ApiOperation(value="注册用户", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "mobilecode", value = "手机验证码", required = true, dataType = "String")
    })
    @RequestMapping(value="/api/user", method=RequestMethod.POST,consumes="application/x-www-form-urlencoded",produces="application/json")
    public RestApi<User> insertUser(HttpServletRequest request,
    		@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "mobilecode", required = true) String mobileCode) {
		if (!mobileValidateCodeService.validateCode(username, mobileCode)) {
			return new RestApi<>(StatusCode._40009.getCode());
		}
		User user = new User();
		user.setLogin(username);
		user.setPassword(password);
		user.setRegisterIp(IPv4Util.getIP(request));
		userService.add(user);
		return new RestApi<>(StatusCode._20000.getCode());
    }
	
	@ApiOperation(value="发送手机短信", notes="")
    @ApiImplicitParam(name = "username", value = "用户手机号", required = true, dataType = "String")
    @RequestMapping(value="/api/mobile", method=RequestMethod.GET,consumes="application/json",produces="application/json")
	public RestApi<String> sendMobileCode(HttpServletRequest request,
    		@RequestParam(value = "username", required = true) String username) throws MyJsonCheckedException{
		mobileValidateCodeService.sendValidateCode(username);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@ApiOperation(value="异步验证短信验证码", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户手机号", required = true, dataType = "String"),
            @ApiImplicitParam(name = "mobilecode", value = "手机验证码", required = true, dataType = "String")
    })
    @RequestMapping(value="/api/mobile", method=RequestMethod.POST,consumes="application/x-www-form-urlencoded",produces="application/json")
	public RestApi<String> validateMobileCode(HttpServletRequest request,
    		@RequestParam(value = "username", required = true) String username,
    		@RequestParam(value = "mobilecode", required = true) String mobileCode){
		boolean validate = mobileValidateCodeService.validateCode(username, mobileCode);
		if (validate) {
			return new RestApi<>(StatusCode._20000.getCode());
		}else{
			return new RestApi<>(StatusCode._40008.getCode());
		}
	}
}
