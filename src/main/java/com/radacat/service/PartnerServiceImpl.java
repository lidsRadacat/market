package com.radacat.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
}
