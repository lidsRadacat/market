package com.radacat.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.radacat.dao.AreaReponsitory;
import com.radacat.mapper.AreaMapper;
import com.radacat.vo.AreaVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月8日 下午10:27:07
 * @version: V1.0
 */
@Service
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	AreaMapper areaMapper;
	
	@Autowired
	AreaReponsitory areaReponsitory;
	
	@Resource(name="stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;
	
	@Override
	public AreaVo findInRedis() {
		String areaVoJson = valOpsStr.get("area");
		return JSON.parseObject(areaVoJson, AreaVo.class);
	}

	@Override
	public AreaVo findInMySQL() {
		AreaVo areaVo = new AreaVo();
		List<String> provinces = areaReponsitory.findProvince();
		areaVo.setProvince(provinces);
		List<List<String>> cityList = new ArrayList<List<String>>();
		List<List<List<String>>> countyListList = new ArrayList<List<List<String>>>();
		for(String province : provinces){
			List<String> citys = areaReponsitory.findCity(province);
			cityList.add(citys);			
			List<List<String>> countyList = new ArrayList<List<String>>();
			for(String city:citys){
				List<String> countys = areaReponsitory.findCounty(city);
				countyList.add(countys);
			}
			countyListList.add(countyList);
		}
		areaVo.setCity(cityList);
		areaVo.setCounty(countyListList);
		System.out.println(areaVo);
		String areaVoJson = JSON.toJSONString(areaVo);
		System.out.println(areaVoJson);
		valOpsStr.set("area", areaVoJson);
		AreaVo areaVo2 = JSON.parseObject(areaVoJson, AreaVo.class);
		System.out.println(areaVo2);
		return areaVo;
	}
	
	
}
