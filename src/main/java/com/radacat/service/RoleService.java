package com.radacat.service;

import java.util.List;

import com.radacat.domain.Role;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月7日 上午11:14:58
 * @version: V1.0
 */
public interface RoleService {
	void add(Role role);
	void update(Role role);
	void delete(Role role);
	Role find(Integer id);
	List<Role> findList();
}
