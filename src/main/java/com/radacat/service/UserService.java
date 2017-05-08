package com.radacat.service;

import com.radacat.domain.User;
import com.radacat.vo.UserVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月15日 下午2:26:42
 * @version: V1.0
 */
public interface UserService {
	void add(User user);
	UserVo findUserVO(String username);
}
