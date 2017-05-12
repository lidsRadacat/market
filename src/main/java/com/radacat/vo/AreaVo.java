package com.radacat.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月8日 下午8:14:55
 * @version: V1.0
 */
public class AreaVo implements Serializable{
	private static final long serialVersionUID = -6294195350769911550L;
	public List<String> province;
	public List<List<String>> city;
	public List<List<List<String>>> county;
	public List<String> getProvince() {
		return province;
	}
	public void setProvince(List<String> province) {
		this.province = province;
	}
	public List<List<String>> getCity() {
		return city;
	}
	public void setCity(List<List<String>> city) {
		this.city = city;
	}
	public List<List<List<String>>> getCounty() {
		return county;
	}
	public void setCounty(List<List<List<String>>> county) {
		this.county = county;
	}
	@Override
	public String toString() {
		return "AreaVo [province=" + province + ", city=" + city + ", county=" + county + "]";
	}
}
