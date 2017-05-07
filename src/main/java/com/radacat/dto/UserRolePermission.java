package com.radacat.dto;
/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月5日 下午7:04:04
 * @version: V1.0
 */

import java.io.Serializable;
import java.util.List;

import com.radacat.domain.Permission;
import com.radacat.domain.Role;

public class UserRolePermission implements Serializable{
	private static final long serialVersionUID = 2507306118901842783L;
	private Long uid;
	private Role role;
	public List<Permission> permissions;
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "UserRolePermission [uid=" + uid + ", role=" + role + ", permissions=" + permissions + "]";
	}
}
