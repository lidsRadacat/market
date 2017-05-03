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
public class ProductController extends BaseConstructor{
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String getProductList(Model model){
		List<Product> products = productService.findAllList();
		model.addAttribute("products", products);
		model.addAttribute("count", products.size());
		return "/product/product-list";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String getProduct(Model model,@PathVariable Long id){
		model.addAttribute("product",productService.find(id));
		return "/product/product-show";
	}
	
	@RequestMapping(value="",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody
	public RestApi<String> addProduct(@RequestBody Product product,HttpServletRequest request){
		System.out.println(product);
		product.setCreateUid(getUid(request));
		productService.add(product);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public RestApi<String> deleteProduct(@PathVariable Long id){
		productService.delete(new Product(id));
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public RestApi<String> updateProduct(@PathVariable Long id,
			@RequestBody Product product){
		product.setId(id);
		productService.update(product);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/stop/{id}",method=RequestMethod.PATCH)
	@ResponseBody
	public RestApi<String> stopProduct(@PathVariable Long id){
		Product product = new Product();
		product.setId(id);
		productService.stop(product);
		return new RestApi<>(StatusCode._20000.getCode());
	}
	
	@RequestMapping(value="/start/{id}",method=RequestMethod.PATCH)
	@ResponseBody
	public RestApi<String> startProduct(@PathVariable Long id){
		Product product = new Product();
		product.setId(id);
		productService.start(product);
		return new RestApi<>(StatusCode._20000.getCode());
	}
}