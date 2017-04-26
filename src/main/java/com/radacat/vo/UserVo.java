package com.radacat.vo;

import java.util.List;

import org.apache.tomcat.jni.Address;

import com.radacat.domain.Partner;
import com.radacat.domain.Permission;
import com.radacat.domain.Points;
import com.radacat.domain.Role;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月20日 上午9:03:35
 * @version: V1.0
 */
public class UserVo {
	private Partner partner;
	private List<Role> roles;
	private List<Permission> permissions;
	private Address address;
	private Points points;
}
