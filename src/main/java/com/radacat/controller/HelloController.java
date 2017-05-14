package com.radacat.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.exception.MyCheckedException;
import com.radacat.utils.IPv4Util;
import com.radacat.vo.ChinaMapSales;
import com.radacat.vo.SaleData;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(HttpServletRequest request) {
		System.out.println(IPv4Util.getIP(request));
		return "Hello Spring-Boot";
	}

//	@RequestMapping("/")
//	public String index(ModelMap map) {
//		map.addAttribute("host", "http://blog.didispace.com");
//		return "index";
//	}
	
	@RequestMapping("/json")
    public String json() throws MyCheckedException {
        throw new MyCheckedException("发生错误2");
    }
	
	@RequestMapping("/defaulterror")
    public String helloexception() throws Exception {
        throw new Exception("发生错误");
    }
	
	@RequestMapping("/chart/{year}")
	@ResponseBody
	public RestApi<ChinaMapSales> hellochart(@PathVariable int year){
		ChinaMapSales chinaMapSales = new ChinaMapSales();
		Map<String, Double[]> geoCoordMap = new HashMap<>();
		geoCoordMap.put("海门", new Double[]{121.15,31.89});
		geoCoordMap.put("鄂尔多斯", new Double[]{109.781327,39.608266});
		geoCoordMap.put("招远", new Double[]{120.38,37.35});
		List<SaleData> saleDatas = new ArrayList<SaleData>();
		List<Double[]> coordRange = new ArrayList<Double[]>();
		for (int i = 0; i < 100; i++) {
			geoCoordMap.put("测试"+i, new Double[]{Math.random()*150,Math.random()*50});
			saleDatas.add(new SaleData("测试"+i,(int)(Math.random()*100)));
			coordRange.add(new Double[]{119.5, 34.84});
		}
		
		saleDatas.add(new SaleData("海门", 9));
		saleDatas.add(new SaleData("鄂尔多斯", 19));
		saleDatas.add(new SaleData("招远", 49));
		
		coordRange.add(new Double[]{119.72, 34.85});
		coordRange.add(new Double[]{119.68, 34.85});
		
		chinaMapSales.setGeoCoordMap(geoCoordMap);
		chinaMapSales.setSaleDatas(saleDatas);
		chinaMapSales.setCoordRange(coordRange);
		return new RestApi<ChinaMapSales>(StatusCode._20000.getCode(), chinaMapSales);
	}
}
