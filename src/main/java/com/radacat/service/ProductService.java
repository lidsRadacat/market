package com.radacat.service;

import java.util.List;

import com.radacat.domain.Product;


/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:29:16
 * @version: V1.0
 */
public interface ProductService {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	List<Product> findAllList();
	Product find(Long id);
	void stop(Product product);
	void start(Product product);
}
