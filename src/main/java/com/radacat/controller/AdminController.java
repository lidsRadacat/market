package com.radacat.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.domain.Company;
import com.radacat.domain.Partner;
import com.radacat.domain.Role;
import com.radacat.dto.UserInfo;
import com.radacat.service.AdminService;
import com.radacat.service.CompanyService;
import com.radacat.service.RoleService;
import com.radacat.vo.AdminVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月19日 下午8:25:24
 * @version: V1.0
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	CompanyService companyService;
	
//	@ApiOperation(value="显示管理员列表", notes="")
    @RequestMapping(value="/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getAdminList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		List<AdminVo> adminVos = adminService.findList(pageNum, pageSize);
		model.addAttribute("adminVos",adminVos);
		model.addAttribute("count",adminVos.size());
		return "admin/admin-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getAdmin(Model model,@PathVariable Long id){
		model.addAttribute("agencyVo",adminService.find(id));
		return "admin/admin-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addAdmin(@RequestBody UserInfo userInfo,HttpServletRequest request){
//		System.out.println(userInfo);
		adminService.add(userInfo);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteProduct(@PathVariable Long id){
		adminService.delete(new Partner(id));
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateProduct(@PathVariable Long id,
			@RequestBody AdminVo adminVo){
		adminVo.getPartner().setId(id);
		adminService.update(adminVo);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/admin-add")
	public String addAdmin(Model model){
		List<Role> roles = roleService.findList();
		List<Company> companys = companyService.findList(0, 100);
		model.addAttribute("roles", roles);
		model.addAttribute("companys",companys);
		return "admin/admin-add";
	}
	
	@RequestMapping("/admin-edit/{id}")
	public String editAdmin(Model model,@PathVariable Long id){
		model.addAttribute("admin",adminService.find(id));
		List<Role> roles = roleService.findList();
		List<Company> companys = companyService.findList(0, 100);
		model.addAttribute("roles", roles);
		model.addAttribute("companys",companys);
		return "admin/admin-edit";
	}
}
