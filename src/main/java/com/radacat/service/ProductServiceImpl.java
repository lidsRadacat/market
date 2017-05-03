package com.radacat.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radacat.dao.ProductReponsitory;
import com.radacat.domain.Product;
import com.radacat.mapper.ProductMapper;
import com.radacat.utils.IdWorker;

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
	
	@Autowired
	ProductMapper productMapper;
	
	@Autowired
	IdWorker idWorker;
	
	@Override
	public void add(Product product) {
		product.setWriteUid(product.getCreateUid());
		product.setCreateDate(new Date());
		product.setCreateDate(new Date());
		product.setId(idWorker.nextId());
		product.setActive("t");
		product.setStop("f");
		productMapper.insert(product);
	}

	@Override
	public void delete(Product product) {
		product.setWriteDate(new Date());
		product.setActive("f");
		productMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public void update(Product product) {
		product.setWriteDate(new Date());
		productMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public List<Product> findAllList() {
		return productReponsitory.findAllListProduct();
	}
	
	@Override
	public Product find(Long id){
		return productMapper.selectByPrimaryKey(id);
	}

	@Override
	public void stop(Product product) {
		product.setWriteDate(new Date());
		product.setStop("t");
		productMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	public void start(Product product) {
		product.setWriteDate(new Date());
		product.setStop("f");
		productMapper.updateByPrimaryKeySelective(product);
	}

}
