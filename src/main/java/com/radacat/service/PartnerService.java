package com.radacat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radacat.domain.Partner;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:28:31
 * @version: V1.0
 */
@Service
public interface PartnerService {
	
	public void add(Partner partner);
	void delete(Partner partner);
	void update(Partner partner);
	List<Partner> findAllList(int pageNum, int pageSize);
	Partner find(Long id);
}
