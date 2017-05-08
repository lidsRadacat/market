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
import com.radacat.domain.Agency;
import com.radacat.service.AgencyService;
import com.radacat.vo.AgencyVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月3日 下午8:13:40
 * @version: V1.0
 */
@Controller
@RequestMapping(value="/agency")
public class AgencyController extends BaseController{
	@Autowired
	AgencyService agencyService;
	
	@RequestMapping(value="/{pageNum}/{pageSize}",method=RequestMethod.GET)
	public String getPartnerList(@PathVariable int pageNum,
			@PathVariable int pageSize,Model model){
		List<AgencyVo> AgencyVos = agencyService.findAllList(pageNum, pageSize);
		model.addAttribute("agencyVos", AgencyVos);
		model.addAttribute("count",AgencyVos.size());
		return "partner/agency-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getProduct(Model model,@PathVariable Long id){
		model.addAttribute("agencyVo",agencyService.find(id));
		return "partner/agency-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addProduct(@RequestBody Agency agency,HttpServletRequest request){
		System.out.println(agency);
		agencyService.add(agency);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteProduct(@PathVariable Long id){
		agencyService.delete(new Agency(id));
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateProduct(@PathVariable Long id,
			@RequestBody Agency agency){
		agency.setId(id);
		agencyService.update(agency);
		return new RestApi<>(StatusCode._20000.getCode());
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
}
