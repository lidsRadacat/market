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
import com.radacat.service.RoleService;
import com.radacat.vo.AdminVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月10日 下午8:10:47
 * @version: V1.0
 */
@Controller
@RequestMapping(value = "/role")
public class RoleCountroller {
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String getAdminList(Model model){
		List<Role> roles = roleService.findList();
		model.addAttribute("roles",roles);
		model.addAttribute("count",roles.size());
		return "admin/role-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getAdmin(Model model,@PathVariable Integer id){
		model.addAttribute("agencyVo",roleService.find(id));
		return "admin/admin-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addAdmin(@RequestBody Role role,HttpServletRequest request){
		roleService.add(role);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteProduct(@PathVariable Integer id){
		roleService.delete(new Role(id));
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateProduct(@PathVariable Integer id,
			@RequestBody Role role){
		role.setId(id);
		roleService.update(role);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/role-add")
	public String addAdmin(Model model){
		return "admin/admin-role-add";
	}
	
	@RequestMapping("/admin-edit/{id}")
	public String editAdmin(Model model,@PathVariable Integer id){
		model.addAttribute("role",roleService.find(id));
		return "admin/admin-role-edit";
	}
}
