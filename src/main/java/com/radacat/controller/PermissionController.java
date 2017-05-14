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
import com.radacat.domain.Permission;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月12日 下午7:51:38
 * @version: V1.0
 */
@Controller
@RequestMapping(value = "/permission")
public class PermissionController {
	@RequestMapping(value="/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getPermissionList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "admin/permission-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getPermission(Model model,@PathVariable Integer id){
		return "admin/permission-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addPermission(@RequestBody Permission permission,HttpServletRequest request){
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
			@RequestBody Permission permission){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/permission-add")
	public String addPermission(Model model){
		return "admin/permission-add";
	}
	
	@RequestMapping("/permission-edit/{id}")
	public String editPermission(Model model,@PathVariable Integer id){
		return "admin/permission-edit";
	}
}
