package com.radacat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.radacat.domain.Product;


/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月25日 下午9:49:24
 * @version: V1.0
 */
public interface ProductReponsitory extends JpaRepository<Product, Long>{
	@Query("from Product p where p.active='t'")
	List<Product> findAllListProduct();
}
