
/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月12日 下午5:10:07
 * @version: V1.0
 */

package com.radacat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月12日 下午5:10:07
 * @version: V1.0
 */

/**
 * 描述: 
 */
@Controller
@RequestMapping(value="/chart")
public class ChartController {
	@RequestMapping(value="/monthly")
	public String saleOfMonth(Model model){
		return "chart/monthly";
	}
	
	@RequestMapping(value="/global")
	public String saleOfGlobal(Model model){
		return "chart/global";
	}
	
	@RequestMapping(value="/top10")
	public String saleOfTop10(Model model){
		return "chart/top10";
	}
	
	@RequestMapping(value="/china")
	public String saleOfChina(Model model){
		return "chart/china";
	}
	
	@RequestMapping(value="/chinaMap")
	public String saleOfChinaMap(Model model){
		return "chart/chinaMap";
	}
}
