package com.radacat;

import java.util.EnumMap;

import org.junit.Test;

import com.radacat.api.StatusCode;

/**
 * 文件名: TestEnum.java
 * 项目名: market
 * 包名: com.radacat
 * 描述: TODO
 * 作者: 李大双
 * 日期: 2017年4月15日 下午11:01:48
 * 版本: V1.0
 */
public class TestEnum {
	@Test
	public void testEnum(){
		StatusCode code = StatusCode._10000;
		System.out.println(StatusCode._10000.getCode());
		System.out.println(StatusCode._10000.getMessage());
	}
	

}
