package com.radacat.exception;
/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月18日 下午8:28:46
 * @version: V1.0
 */
public class MyRuntimeException extends RuntimeException{
	private static final long serialVersionUID = -4536750977165877342L;

	public MyRuntimeException(String message) {
		super(message);
	}
}
