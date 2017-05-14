package com.radacat.controller;

import javax.servlet.http.HttpServletRequest;

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

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月12日 下午8:22:58
 * @version: V1.0
 */
@Controller
@RequestMapping(value = "/depart")
public class DepartController {
	@RequestMapping(value="/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getPermissionList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "company/depart-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getPermission(Model model,@PathVariable Integer id){
		return "company/depart-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addPermission(@RequestBody Company company,HttpServletRequest request){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deletePermission(@PathVariable Integer id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updatePermission(@PathVariable Integer id,
			@RequestBody Company company){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/depart-add")
	public String addPermission(Model model){
		return "company/depart-add";
	}
	
	@RequestMapping("/company-edit/{id}")
	public String editPermission(Model model,@PathVariable Integer id){
		return "company/company-edit";
	}
}