package com.radacat.exception;
/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月18日 下午9:08:33
 * @version: V1.0
 */
public class MyJsonRuntimeException extends RuntimeException{

	private static final long serialVersionUID = -5654704049232050018L;

	public MyJsonRuntimeException(String message) {
		super(message);
	}
}
