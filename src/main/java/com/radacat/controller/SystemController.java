package com.radacat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月12日 下午8:51:46
 * @version: V1.0
 */
@Controller
@RequestMapping
public class SystemController {

	@RequestMapping(value="/dada-delete/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getDadaDeleteList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "systems/dada-delete-list";
	}
	
	@RequestMapping(value="/dictionary-list/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getDictionaryList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "systems/data-dictionary-list";
	}
	
	@RequestMapping(value="/feedback-list/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getFeedbackList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "systems/feedback-list";
	}
	
	@RequestMapping(value="/login-log-list/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getLoginLogList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "systems/login-log-list";
	}
}
