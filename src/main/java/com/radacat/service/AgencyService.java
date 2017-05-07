package com.radacat.service;

import java.util.List;

import com.radacat.domain.Agency;
import com.radacat.vo.AgencyVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月3日 下午8:14:58
 * @version: V1.0
 */
public interface AgencyService {
	public void add(Agency agency);
	void delete(Agency agency);
	void update(Agency agency);
	List<AgencyVo> findAllList(int pageNum, int pageSize);
	AgencyVo find(Long id);
}
