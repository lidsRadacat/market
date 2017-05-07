package com.radacat.vo;

import org.apache.tomcat.jni.Address;

import com.radacat.domain.Partner;
import com.radacat.domain.User;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月3日 下午7:35:08
 * @version: V1.0
 */
public class PartnerVo extends Partner{
	private User user;
	private Address address;

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "PartnerVo [user=" + user + ", address=" + address + "]";
	}
}
