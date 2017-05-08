package com.radacat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radacat.domain.Company;
import com.radacat.mapper.CompanyMapper;
import com.radacat.vo.CompanyVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月24日 下午9:10:32
 * @version: V1.0
 */
@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyMapper companyMapper;
	
	@Autowired
	AddressService addressService;
	
	@Override
	public void add(Company company) {
		company.setActive("t");
		company.setCreateUid(1L);
		company.setCreateDate(new Date());
		company.setWriteUid(1L);
		company.setWriteDate(new Date());
		companyMapper.insertSelective(company);
	}

	@Override
	public void delete(Company company) {
		company.setActive("f");
		company.setWriteDate(new Date());
		companyMapper.updateByPrimaryKeySelective(company);
	}

	@Override
	public void update(Company company) {
		company.setWriteDate(new Date());
		companyMapper.updateByPrimaryKeySelective(company);
	}

	@Override
	public Company find(Company company) {
		return companyMapper.selectByPrimaryKey(company.getId());
	}

	@Override
	public List<Company> findList(int pageNum, int pageSize) {
//		PageHelper.startPage(pageNum, pageSize);
		List<Company> companys = companyMapper.findAllCompany();
		return companys;
	}

	@Override
	public List<CompanyVo> findVoList(int pageNum, int pageSize) {
		List<CompanyVo> companyVos = new ArrayList<CompanyVo>();
		for(Company compay:findList(pageNum,pageSize)){
			CompanyVo companyVo = new CompanyVo();
			companyVo.setCompay(compay);
			companyVo.setAddressVo(addressService.findAddressVo(compay.getAreaId()));
			companyVos.add(companyVo);
		}
		return companyVos;
	}
}
