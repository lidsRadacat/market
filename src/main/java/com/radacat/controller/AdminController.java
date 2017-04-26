package com.radacat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.domain.Area;
import com.radacat.domain.Partner;
import com.radacat.service.AdminService;

import io.swagger.annotations.ApiOperation;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月19日 下午8:25:24
 * @version: V1.0
 */
@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@ApiOperation(value="显示管理员列表", notes="")
    @RequestMapping(value="/admins/{pageNum}/{pageSize}", method=RequestMethod.GET,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<List<Partner>> showAdmin(@PathVariable int pageNum, 
			@PathVariable int pageSize,
			ModelMap map){
		return new RestApi<List<Partner>>(StatusCode._20000.getCode(), adminService.findList(pageNum, pageSize), StatusCode._20000.getMessage());
	}
}
