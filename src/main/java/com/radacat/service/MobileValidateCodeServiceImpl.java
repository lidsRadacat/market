package com.radacat.service;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.radacat.exception.MyJsonCheckedException;
import com.radacat.utils.MobileCodeUtil;
import com.taobao.api.ApiException;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月18日 下午9:23:54
 * @version: V1.0
 */
@Service
public class MobileValidateCodeServiceImpl implements MobileValidateCodeService{

	@Autowired  
    StringRedisTemplate stringRedisTemplate;  
    
    @Resource(name="stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;
	
	@Override
	public void sendValidateCode(String mobile) throws MyJsonCheckedException {
		String code = "";
		try {
			code = MobileCodeUtil.sendAuthCode(mobile);
			valOpsStr.set(mobile, code,300L,TimeUnit.SECONDS);
		} catch (ApiException e) {
			e.printStackTrace();
			throw new MyJsonCheckedException("alidayu api error");
		}
		
	}

	@Override
	public boolean validateCode(String mobile, String code) {
		String codeInDB = valOpsStr.get(mobile);
		return code.equals(codeInDB);
	}

}
