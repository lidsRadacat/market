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
import com.radacat.domain.Partner;
import com.radacat.service.PartnerService;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月2日 下午8:01:52
 * @version: V1.0
 */
@Controller
@RequestMapping(value="/partner")
public class partnerController extends BaseController{
	
	@Autowired
	PartnerService partnerService;
	
	@RequestMapping(value="/{pageNum}/{pageSize}",method=RequestMethod.GET)
	public String getPartnerList(@PathVariable int pageNum,
			@PathVariable int pageSize,Model model){
		List<Partner> partners = partnerService.findAllList(pageNum, pageSize);
		model.addAttribute("partners", partners);
		model.addAttribute("count",partners.size());
		return "partner/partner-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getPartner(Model model,@PathVariable Long id){
		model.addAttribute("partner",partnerService.find(id));
		return "partner/partner-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addPartner(@RequestBody Partner partner,HttpServletRequest request){
		System.out.println(partner);
		partner.setCreateUid(getUid(request));
		partnerService.add(partner);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteProduct(@PathVariable Long id){
		partnerService.delete(new Partner(id));
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> updateProduct(@PathVariable Long id,
			@RequestBody Partner partner){
		partner.setId(id);
		partnerService.update(partner);
		return new RestApi<>(StatusCode._20000.getCode());
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
}
