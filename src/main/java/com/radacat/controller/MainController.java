package com.radacat.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radacat.domain.Partner;
import com.radacat.service.AdminService;
import com.radacat.service.AgencyService;
import com.radacat.service.PartnerService;
import com.radacat.service.ProductService;
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
	
	@RequestMapping(value = {"/","/index"})
	public String index() {
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
	
	@RequestMapping("/register")
	public String register(){
		return "user/register";
	}
	
	@RequestMapping(value="/login")
	public String loginForm(){
		return "user/login";
	}
	
	@RequestMapping("/chart")
	public String getChart(){
		return "chart/chinaCitySales1";
	}
	
	@RequestMapping("/product-add")
	public String addProduct(){
		return "product/product-add";
	}
	
	@RequestMapping("/product-edit/{id}")
	public String editProduct(Model model,@PathVariable Long id){
		model.addAttribute("product",productService.find(id));
		return "product/product-edit";
	}

	@RequestMapping("/partner-add")
	public String addPartner(){
		return "partner/partner-add";
	}
	
	@RequestMapping("/partner-edit/{id}")
	public String editPartner(Model model,@PathVariable Long id){
		model.addAttribute("product",partnerService.find(id));
		return "partner/partner-edit";
	}
	
	@RequestMapping("/agency-add")
	public String addAgency(){
		return "partner/agency-add";
	}
	
	@RequestMapping("/agency-edit/{id}")
	public String editAgency(Model model,@PathVariable Long id){
		model.addAttribute("agency",agencyService.find(id));
		return "partner/agency-edit";
	}
	
	@RequestMapping("/admin-add")
	public String addAdmin(){
		return "admin/admin-add";
	}
	
	@RequestMapping("/admin-edit/{id}")
	public String editAdmin(Model model,@PathVariable Long id){
		model.addAttribute("admin",adminService.find(new Partner(id)));
		return "admin/admin-edit";
	}
}
