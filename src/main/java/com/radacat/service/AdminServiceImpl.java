package com.radacat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.radacat.domain.Partner;
import com.radacat.mapper.PartnerMapper;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月19日 下午9:00:00
 * @version: V1.0
 */
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	PartnerMapper partnerMapper;
	
	@Override
	public void add(Partner partner) {
	}
	
	@Override
	public void delete(Partner partner) {
	}
	
	@Override
	public void update(Partner partner) {
	}
	
	@Override
	public Partner find(Partner partner) {
		return null;
	}
	
	@Override
	public List<Partner> findList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<Partner> admins = partnerMapper.findAllAdmin();
		return admins;
	}
}
