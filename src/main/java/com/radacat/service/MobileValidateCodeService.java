package com.radacat.service;

import com.radacat.exception.MyJsonCheckedException;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月18日 下午9:23:30
 * @version: V1.0
 */
public interface MobileValidateCodeService{
	public void sendValidateCode(String mobile) throws MyJsonCheckedException;
	public boolean validateCode(String mobile,String code);
}
