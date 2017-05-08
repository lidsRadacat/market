package com.radacat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radacat.domain.Area;
import com.radacat.mapper.AreaMapper;
import com.radacat.mapper.CountryMapper;
import com.radacat.vo.AddressVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月7日 下午12:47:59
 * @version: V1.0
 */
@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	CountryMapper countryMapper;
	
	@Autowired
	AreaMapper areaMapper;

	@Override
	public AddressVo findAddressVo(Integer id) {
		AddressVo addressVo = new AddressVo();
		Area area = areaMapper.selectByPrimaryKey(id);
		addressVo.setCountry(countryMapper.selectByPrimaryKey(area.getCountryId()).getName());
		addressVo.setCity(area.getCity());
		addressVo.setCounty(area.getCounty());
		addressVo.setLatitude(area.getLatitude());
		addressVo.setLongitude(area.getLongitude());
		addressVo.setProvince(area.getProvince());
		return addressVo;
	}
	

}
