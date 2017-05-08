package com.radacat.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radacat.domain.Role;
import com.radacat.service.AdminService;
import com.radacat.service.AgencyService;
import com.radacat.service.PartnerService;
import com.radacat.service.ProductService;
import com.radacat.service.RoleService;
import com.radacat.service.UserService;
import com.radacat.utils.authcode.Captcha;
import com.radacat.utils.authcode.SpecCaptcha;

/**
 * 文件名: MainController.java
 * 项目名: market
 * 包名: com.radacat.controller
 * 描述: TODO
 * 作者: 李大双
 * 日期: 2017年4月16日 下午7:29:46
 * 版本: V1.0
 */
@Controller
public class MainController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	PartnerService partnerService;
	
	@Autowired
	AgencyService agencyService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = {"/","/index"})
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping("/code")
	public void jpegCode(HttpServletResponse response,HttpSession session) throws IOException{
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpg");
		/**
		 * jgp格式验证码 宽，高，位数。
		 */
		Captcha captcha = new SpecCaptcha(100, 41, 4);
		// 输出
		captcha.out(response.getOutputStream());
		// 存入Session
		session.setAttribute("code", captcha.text().toLowerCase());
	}
	
	@RequestMapping("/chart")
	public String getChart(){
		return "chart/chinaCitySales1";
	}
}
