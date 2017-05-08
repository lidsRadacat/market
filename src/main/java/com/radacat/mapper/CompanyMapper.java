package com.radacat.mapper;

import java.util.List;

import com.radacat.domain.Company;

public interface CompanyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Company company);

    int insertSelective(Company company);

    Company selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Company company);

    int updateByPrimaryKey(Company company);
    
    List<Company> findAllCompany();
}