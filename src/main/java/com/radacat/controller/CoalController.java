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
import com.radacat.domain.Goal;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月13日 下午9:44:10
 * @version: V1.0
 */
@Controller
public class CoalController {
	@RequestMapping(value="/goal-company/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getCompanyGoalList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "goal/company-goal-list";
	}
	
	@RequestMapping(value="/goal-company/{id}",method=RequestMethod.GET)
	public String getCompanyGoal(Model model,@PathVariable Integer id){
		return "goal/company-goal-list";
	}
	
	@RequestMapping(value="/goal-company",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addCompanyGoal(@RequestBody Goal goal,HttpServletRequest request){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/goal-company/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteCompanyGoal(@PathVariable Integer id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/goal-company/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateCompanyGoal(@PathVariable Integer id,
			@RequestBody Goal goal){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/goal-company-add")
	public String addCompanyEdit(Model model){
		return "goal/company-goal-add";
	}
	
	@RequestMapping("/goal-company-edit/{id}")
	public String editCompanyEdit(Model model,@PathVariable Integer id){
		return "goal/company-goal-edit";
	}
	
	
	
	
	
	
	@RequestMapping(value="/goal-depart/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getDepartGoalList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "goal/depart-goal-list";
	}
	
	@RequestMapping(value="/goal-depart/{id}",method=RequestMethod.GET)
	public String getDepartGoal(Model model,@PathVariable Integer id){
		return "goal/depart-goal-list";
	}
	
	@RequestMapping(value="/goal-depart",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addDepartGoal(@RequestBody Goal goal,HttpServletRequest request){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/goal-depart/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteDepartGoal(@PathVariable Integer id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/goal-depart/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateDepartGoal(@PathVariable Integer id,
			@RequestBody Goal goal){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/goal-depart-add")
	public String addDepartEdit(Model model){
		return "goal/depart-goal-add";
	}
	
	@RequestMapping("/goal-depart-edit/{id}")
	public String editDepartEdit(Model model,@PathVariable Integer id){
		return "goal/depart-goal-edit";
	}
	


	
	
	
	
	@RequestMapping(value="/goal-person/{pageNum}/{pageSize}", method=RequestMethod.GET)
	public String getPersonGoalList(@PathVariable int pageNum, 
			@PathVariable int pageSize,Model model){
		return "goal/person-goal-list";
	}
	
	@RequestMapping(value="/goal-person/{id}",method=RequestMethod.GET)
	public String getPersonGoal(Model model,@PathVariable Integer id){
		return "goal/person-goal-list";
	}
	
	@RequestMapping(value="/goal-person",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addPersonGoal(@RequestBody Goal goal,HttpServletRequest request){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/goal-person/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deletePersonGoal(@PathVariable Integer id){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/goal-person/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updatePersonGoal(@PathVariable Integer id,
			@RequestBody Goal goal){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping("/goal-person-add")
	public String addPersonEdit(Model model){
		return "goal/person-goal-add";
	}
	
	@RequestMapping("/goal-person-edit/{id}")
	public String editPersonEdit(Model model,@PathVariable Integer id){
		return "goal/depart-person-edit";
	}
}
