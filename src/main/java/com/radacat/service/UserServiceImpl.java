package com.radacat.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.radacat.domain.Partner;
import com.radacat.domain.User;
import com.radacat.exception.MyRuntimeException;
import com.radacat.mapper.UserMapper;
import com.radacat.utils.IdWorker;
import com.radacat.utils.ShiroPasswordHelper;
import com.radacat.utils.StringUtils;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:26:59
 * @version: V1.0
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Autowired
	IdWorker idWorker;
	
	@Autowired
	PartnerService partnerService;
	
	@Autowired
	ShiroPasswordHelper shiroPasswordHelper;
	
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	@Override
	public void add(User user) {
		shiroPasswordHelper.encryptPassword(user);
		user.setActive("t");
		user.setCreateDate(new Date());
		user.setCreateUid(1L);
		user.setWriteDate(new Date());
		user.setWriteUid(1L);
		user.setRegisterDate(new Date());
		long id = idWorker.nextId();
		user.setId(id);
		user.setPartnerId(id);
		Partner partner = new Partner();
		partner.setId(id);
		partner.setActive("t");
		partner.setType("3");
		partner.setMobile(user.getLogin());
		partner.setCreateUid(1L);
		partner.setCreateDate(new Date());
		partner.setWriteUid(1L);
		partner.setWriteDate(new Date());
		partnerService.add(partner);
		int insert = userMapper.insert(user);
		if (insert == 0) {
			throw new MyRuntimeException("rollback insert user");
		}
	}
}
