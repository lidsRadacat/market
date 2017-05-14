package com.radacat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.service.AreaService;
import com.radacat.vo.AreaVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月8日 下午8:06:05
 * @version: V1.0
 */
@RestController
public class AreaController {
	@Autowired
	AreaService areaService;
	
	@RequestMapping(value="/area", method=RequestMethod.GET)
	public RestApi<AreaVo> getAdminList(){
		AreaVo areaVo = areaService.findInRedis();
		return new RestApi<AreaVo>(StatusCode._20000.getCode(), areaVo, StatusCode._20000.getMessage());
	}
}
