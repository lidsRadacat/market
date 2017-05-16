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
 * @date: 2017年5月15日 下午10:04:34
 * @version: V1.0
 */
@Controller
@RequestMapping(value="opportunity")
public class OpportunityController {
	@RequestMapping(value="/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getOpportunityList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "market/opportunity-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getOpportunity(Model model,@PathVariable Integer id){
		return "market/opportunity-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addOpportunity(@RequestBody Company company,HttpServletRequest request){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteOpportunity(@PathVariable Integer id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateOpportunity(@PathVariable Integer id,
			@RequestBody Company company){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/company-add")
	public String addOpportunity(Model model){
		return "market/opportunity-add";
	}
	
	@RequestMapping("/company-edit/{id}")
	public String editOpportunity(Model model,@PathVariable Integer id){
		return "market/opportunity-edit";
	}
}
