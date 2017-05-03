package com.radacat.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月1日 上午1:18:28
 * @version: V1.0
 */
public abstract class BaseConstructor {
	public Long getUid(HttpServletRequest request){
		return 1L;
	}
}
