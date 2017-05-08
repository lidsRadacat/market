package com.radacat.vo;

import java.io.Serializable;

import com.radacat.domain.Partner;
import com.radacat.dto.UserRolePermission;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月4日 下午9:52:32
 * @version: V1.0
 */
public class AdminVo implements Serializable{	
	private static final long serialVersionUID = 6887640890734863655L;
	private Partner partner;
	private AddressVo addressVo;
	private UserRolePermission userRolePermission;
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
	}
	public AddressVo getAddressVo() {
		return addressVo;
	}
	public void setAddressVo(AddressVo addressVo) {
		this.addressVo = addressVo;
	}
	public UserRolePermission getUserRolePermission() {
		return userRolePermission;
	}
	public void setUserRolePermission(UserRolePermission userRolePermission) {
		this.userRolePermission = userRolePermission;
	}
	@Override
	public String toString() {
		return "AdminVo [partner=" + partner + ", addressVo=" + addressVo + ", userRolePermission=" + userRolePermission
				+ "]";
	}
}
