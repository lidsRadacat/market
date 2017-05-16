package com.radacat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月14日 下午7:22:33
 * @version: V1.0
 */
@Controller
public class PointController {
	@RequestMapping(value="/points/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getPointList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "points/points-list";
	}
	
	@RequestMapping(value="/points/{id}",method=RequestMethod.GET)
	public String getPoint(Model model,@PathVariable Long id){
		return "points/points-show";
	}
	
	@RequestMapping(value="/points/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deletePoint(@PathVariable Long id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/history-points/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getHistoryPointList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "points/history-points-list";
	}
	
	@RequestMapping(value="/history-points/{id}",method=RequestMethod.GET)
	public String getHistoryPoint(Model model,@PathVariable Long id){
		return "points/history-points-show";
	}
	
	@RequestMapping(value="/history-points/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteHistoryPoint(@PathVariable Long id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
}
