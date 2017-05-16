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
 * @date: 2017年5月15日 下午9:57:17
 * @version: V1.0
 */
@Controller
@RequestMapping(value="activity")
public class ActivityController {
	@RequestMapping(value="/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getActivityList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "market/activity-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getActivity(Model model,@PathVariable Integer id){
		return "market/activity-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addActivity(@RequestBody Company company,HttpServletRequest request){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteActivity(@PathVariable Integer id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateActivity(@PathVariable Integer id,
			@RequestBody Company company){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/activity-add")
	public String addActivity(Model model){
		return "market/activity-add";
	}
	
	@RequestMapping("/activity-edit/{id}")
	public String editActivity(Model model,@PathVariable Integer id){
		return "market/activity-edit";
	}
}
