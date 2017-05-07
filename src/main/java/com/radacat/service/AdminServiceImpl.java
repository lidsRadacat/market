package com.radacat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.radacat.domain.Partner;
import com.radacat.domain.UserRole;
import com.radacat.dto.UserRolePermission;
import com.radacat.mapper.PartnerMapper;
import com.radacat.mapper.RoleMapper;
import com.radacat.mapper.UserRoleMapper;
import com.radacat.vo.AdminVo;

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
	
	@Autowired
	UserRoleMapper userRoleMapper;
	
	@Autowired
	RoleMapper roleMapper;
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	@Override
	public void add(Partner partner) {
		partnerMapper.insert(partner);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	@Override
	public void add(AdminVo adminVo) {
		UserRole userRole =new UserRole();
		userRole.setRid(adminVo.getUserRolePermission().getRole().getId());
		userRole.setUid(adminVo.getPartner().getId());
		userRole.setCreateDate(new Date());
		userRole.setWriteDate(new Date());
		userRoleMapper.insert(userRole);
		add(adminVo.getPartner());
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	@Override
	public void delete(Partner partner) {
		partner.setActive("f");
		partner.setWriteDate(new Date());
		partnerMapper.updateByPrimaryKeySelective(partner);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	@Override
	public void update(Partner partner) {
		partner.setWriteDate(new Date());
		partnerMapper.updateByPrimaryKeySelective(partner);
	}
	
	@Override
	public void update(AdminVo adminVo) {
		UserRole userRole =new UserRole();
		userRole.setRid(adminVo.getUserRolePermission().getRole().getId());
		userRole.setUid(adminVo.getPartner().getId());
		userRole.setWriteDate(new Date());
		userRoleMapper.updateByPrimaryKeySelective(userRole);
		update(adminVo.getPartner());
	}
	
	@Override
	public AdminVo find(Partner partner) {
		Partner admin = partnerMapper.selectByPrimaryKey(partner.getId());
		UserRolePermission userRolePermission = userRoleMapper.findUserRolePermission(partner.getId());
		AdminVo adminVo = new AdminVo();
		adminVo.setPartner(admin);
		adminVo.setUserRolePermission(userRolePermission);
		return adminVo;
	}
	
	@Override
	public List<AdminVo> findList(int pageNum, int pageSize) {
//		PageHelper.startPage(pageNum,pageSize);
		List<Partner> admins = partnerMapper.findAllAdmin();
		List<AdminVo> adminVos = new ArrayList<AdminVo>();
		for (Partner admin : admins) {
			UserRolePermission userRolePermission = userRoleMapper.findUserRolePermission(admin.getId());
			AdminVo adminVo = new AdminVo();
			adminVo.setUserRolePermission(userRolePermission);
			adminVo.setPartner(admin);
			adminVos.add(adminVo);
		}
		return adminVos;
	}

}
