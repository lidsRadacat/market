package com.radacat.vo;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月22日 下午7:19:18
 * @version: V1.0
 */
public class SaleData implements Serializable{
	private static final long serialVersionUID = -6009438517782751223L;
	public String name;
	public int value;
	public SaleData(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	public SaleData() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
