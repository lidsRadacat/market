package com.radacat.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.domain.Product;
import com.radacat.service.ProductService;


/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月25日 下午9:35:54
 * @version: V1.0
 */
@Controller
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String getProductList(Model model){
		List<Product> products = productService.findAllList();
		model.addAttribute("products", products);
		model.addAttribute("count", products.size());
		return "/product/product-list";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseBody
	public RestApi<String> addProduct(@RequestBody Product product){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteProduct(@RequestBody Product product){
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateProduct(@RequestBody Product product){
		return new RestApi<>(StatusCode._20000.getCode());
	}
}
