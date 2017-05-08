package com.radacat.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radacat.dao.RoleRepository;
import com.radacat.domain.Role;
import com.radacat.mapper.RoleMapper;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月7日 上午11:18:56
 * @version: V1.0
 */
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleMapper roleMapper;
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public void add(Role role) {
		role.setActive("t");
		role.setCreateDate(new Date(0));
		role.setWriteDate(new Date());
		role.setCreateUid(1L);
		role.setWriteUid(1L);
		roleMapper.insert(role);
	}

	@Override
	public void update(Role role) {
		role.setWriteDate(new Date());
		roleMapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public void delete(Role role) {
		role.setActive("f");
		role.setWriteDate(new Date());
		roleMapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public Role find(Integer id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Role> findList() {
		return roleRepository.findAllListRole();
	}

}
