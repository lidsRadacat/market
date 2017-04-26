package com.radacat.service;

import java.util.List;

import com.radacat.domain.Company;


/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:29:31
 * @version: V1.0
 */
public interface CompanyService {
	void add(Company company);
	void delete(Company company);
	void update(Company company);
	Company find(Company company);
	List<Company> findList(int pageNum,int pageSize);
}
