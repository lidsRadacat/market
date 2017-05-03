package com.radacat.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.radacat.domain.Partner;
import com.radacat.exception.MyRuntimeException;
import com.radacat.mapper.PartnerMapper;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月18日 下午7:39:39
 * @version: V1.0
 */
@Service
public class PartnerServiceImpl implements PartnerService {
	
	@Autowired
	PartnerMapper partnerMapper;
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	@Override
	public void add(Partner partner){
		int insert = partnerMapper.insertSelective(partner);
		if(insert == 0){
			throw new MyRuntimeException("rollback partner");
		}
	}

	@Override
	public void delete(Partner partner) {
		partner.setWriteDate(new Date());
		partnerMapper.updateByPrimaryKeySelective(partner);
	}

	@Override
	public void update(Partner partner) {
		partner.setWriteDate(new Date());
		partnerMapper.updateByPrimaryKeySelective(partner);
	}

	@Override
	public List<Partner> findAllList(int pageNum, int pageSize) {
//		PageHelper.startPage(pageNum,pageSize);
		List<Partner> partners = partnerMapper.findAllPartner();
		System.out.println(partners);
		return partners;
	}

	@Override
	public Partner find(Long id) {
		return partnerMapper.selectByPrimaryKey(id);
	}
}
