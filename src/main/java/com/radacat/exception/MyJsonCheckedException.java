package com.radacat.exception;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/5/2 上午10:50.
 * @blog http://blog.didispace.com
 */
public class MyJsonCheckedException extends Exception {
	private static final long serialVersionUID = -5734434471954144011L;

	public MyJsonCheckedException(String message) {
        super(message);
    }
}
