package com.radacat.service;

import java.util.List;

import com.radacat.domain.Partner;
import com.radacat.dto.UserInfo;
import com.radacat.vo.AdminVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:27:55
 * @version: V1.0
 */
public interface AdminService {
	void add(Partner partner);
	void add(AdminVo adminVo);
	void add(UserInfo userInfo);
	void delete(Partner partner);
	void update(Partner partner);
	void update(AdminVo adminVo);
	AdminVo find(Long id);
	List<AdminVo> findList(int pageNum, int pageSize);
}
