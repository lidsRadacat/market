package com.radacat.service;

import com.radacat.vo.AreaVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月8日 下午8:08:05
 * @version: V1.0
 */
public interface AreaService {
	AreaVo findInRedis();
	AreaVo findInMySQL();
}
