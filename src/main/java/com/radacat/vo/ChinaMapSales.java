package com.radacat.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月22日 下午4:01:01
 * @version: V1.0
 */
public class ChinaMapSales implements Serializable{
	private static final long serialVersionUID = 3977774113226018673L;
	private List<Double[]> coordRange;
	private List<SaleData> saleDatas;
	private Map<String, Double[]> geoCoordMap;
	
	public List<Double[]> getCoordRange() {
		return coordRange;
	}

	public void setCoordRange(List<Double[]> coordRange) {
		this.coordRange = coordRange;
	}
	
	public List<SaleData> getSaleDatas() {
		return saleDatas;
	}

	public void setSaleDatas(List<SaleData> saleDatas) {
		this.saleDatas = saleDatas;
	}

	public Map<String, Double[]> getGeoCoordMap() {
		return geoCoordMap;
	}

	public void setGeoCoordMap(Map<String, Double[]> geoCoordMap) {
		this.geoCoordMap = geoCoordMap;
	}

}

