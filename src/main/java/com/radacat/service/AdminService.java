package com.radacat.service;

import java.util.List;

import com.radacat.domain.Area;
import com.radacat.domain.Partner;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:27:55
 * @version: V1.0
 */
public interface AdminService {
	void add(Partner partner);
	void delete(Partner partner);
	void update(Partner partner);
	Partner find(Partner partner);
	List<Partner> findList(int pageNum, int pageSize);
}
