package com.radacat.vo;

import java.io.Serializable;
import java.util.List;

import com.radacat.domain.Partner;
import com.radacat.domain.Permission;
import com.radacat.domain.Points;
import com.radacat.domain.Role;
import com.radacat.domain.User;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月20日 上午9:03:35
 * @version: V1.0
 */
public class UserVo implements Serializable{
	private static final long serialVersionUID = -2049743057260039456L;
	private User user;
	private Partner partner;
	private Role role;
	private List<Permission> permissions;
	private AddressVo addressVo;
	private Points points;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
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
	public AddressVo getAddressVo() {
		return addressVo;
	}
	public void setAddressVo(AddressVo addressVo) {
		this.addressVo = addressVo;
	}
	public Points getPoints() {
		return points;
	}
	public void setPoints(Points points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "UserVo [user=" + user + ", partner=" + partner + ", role=" + role + ", permissions=" + permissions
				+ ", addressVo=" + addressVo + ", points=" + points + "]";
	}
}
