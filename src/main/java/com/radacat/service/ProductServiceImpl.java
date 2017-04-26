package com.radacat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radacat.dao.ProductReponsitory;
import com.radacat.domain.Product;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月25日 下午9:53:20
 * @version: V1.0
 */
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductReponsitory productReponsitory;
	
	@Override
	public void add(Product product) {
	}

	@Override
	public void delete(Product product) {
	}

	@Override
	public void update(Product product) {
	}

	@Override
	public List<Product> findAllList() {
		return productReponsitory.findAllListProduct();
	}

}
