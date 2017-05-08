package com.radacat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radacat.domain.Agency;
import com.radacat.domain.Area;
import com.radacat.domain.Partner;
import com.radacat.domain.Product;
import com.radacat.mapper.AgencyMapper;
import com.radacat.mapper.AreaMapper;
import com.radacat.mapper.CountryMapper;
import com.radacat.mapper.PartnerMapper;
import com.radacat.mapper.ProductMapper;
import com.radacat.utils.IdWorker;
import com.radacat.vo.AddressVo;
import com.radacat.vo.AgencyVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月3日 下午8:16:41
 * @version: V1.0
 */
@Service
public class AgencyServiceImpl implements AgencyService{

	@Autowired
	AgencyMapper agencyMapper;

	@Autowired
	ProductMapper productMapper;
	
	@Autowired
	PartnerMapper partnerMapper;
	
	@Autowired
	AddressService addressService;
	
	@Autowired
	IdWorker idWorker;
	@Override
	public void add(Agency agency) {
		agency.setActive("t");
		agency.setId(idWorker.nextId());
		agency.setWriteDate(new Date());
		agency.setCreateDate(new Date());
		agency.setWriteUid(1L);
		agency.setCreateUid(1L);
		agencyMapper.insert(agency);
	}

	@Override
	public void delete(Agency agency) {
		agency.setActive("f");
		agency.setWriteDate(new Date());
		agencyMapper.updateByPrimaryKeySelective(agency);
	}

	@Override
	public void update(Agency agency) {
		agency.setWriteDate(new Date());
		agencyMapper.updateByPrimaryKeySelective(agency);
	}

	@Override
	public List<AgencyVo> findAllList(int pageNum, int pageSize) {
//		Page<Object> page = PageHelper.startPage(pageNum, pageSize, true);
		List<Agency> agencys = agencyMapper.findAllAgency();
		List<AgencyVo> agencyVos = new ArrayList<AgencyVo>();
		for(Agency agency:agencys){
			agencyVos.add(packageAgencyVo(agency));
		}
		return agencyVos;
	}

	@Override
	public AgencyVo find(Long id) {
		Agency agency = agencyMapper.selectByPrimaryKey(id);
		return packageAgencyVo(agency);
	}
	
	private AgencyVo packageAgencyVo(Agency agency){
		AgencyVo agencyVo = new AgencyVo();
		Product product = productMapper.selectByPrimaryKey(agency.getProductId().longValue());
		Partner partner = partnerMapper.selectByPrimaryKey(agency.getCreateUid());
		AddressVo addressVo = addressService.findAddressVo(agency.getAreaId());
		agencyVo.setAreaId(agency.getAreaId());
		agencyVo.setCreateDate(agency.getCreateDate());
		agencyVo.setCreateUid(agency.getCreateUid());
		agencyVo.setDiscount(agency.getDiscount());
		agencyVo.setId(agency.getId());
		agencyVo.setPickingCount(agency.getPickingCount());
		agencyVo.setPickingPrice(agency.getPickingPrice());
		agencyVo.setPickingTotal(agency.getPickingTotal());
		agencyVo.setProductId(agency.getProductId());
		agencyVo.setProductId(agency.getProductId());
		agencyVo.setRegisterCount(agency.getRegisterCount());
		agencyVo.setWriteDate(agency.getWriteDate());
		agencyVo.setWriteUid(agency.getWriteUid());
		agencyVo.setProduct(product);
		agencyVo.setAddressVo(addressVo);
		agencyVo.setPartner(partner);
		return agencyVo;
	}

}
