package com.radacat.vo;

import java.io.Serializable;

import com.radacat.domain.Company;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月7日 下午12:42:54
 * @version: V1.0
 */
public class CompanyVo implements Serializable{
	private static final long serialVersionUID = -6860512154877071457L;
	private Company compay;
	private AddressVo addressVo;
	public Company getCompay() {
		return compay;
	}
	public void setCompay(Company compay) {
		this.compay = compay;
	}
	public AddressVo getAddressVo() {
		return addressVo;
	}
	public void setAddressVo(AddressVo addressVo) {
		this.addressVo = addressVo;
	}
	@Override
	public String toString() {
		return "CompanyVo [compay=" + compay + ", addressVo=" + addressVo + "]";
	}
}
