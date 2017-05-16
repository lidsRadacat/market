package com.radacat.api;

import java.io.Serializable;

/** 
* <p>开发公司：XX科技  <p>
* <p>版权所有：XX科技  <p>
* <p>地址：www.radacat.com <p>
* <p>责任人	李大双   <p> 
* @author 李大双
* @email lids@radacat.com
* @date 2017年1月5日 下午4:27:37
* @version V1.0
*/
/**
 * 类名: JsonResult
 * 描述: 此类是:自定义的json返回格式
 */
public class RestApi<T> implements Serializable{
	private static final long serialVersionUID = -3173071373808908769L;
	private String code;//结果代码号
	private T result;//结果集
	private String msg;//友情提示信息
	/**
	 * @Title:JsonResult
	 * @Description:构造方法，至少一个参数，没有无参的构造方法
	 * @param code
	 */
	public RestApi(String code) {
		this.code = code;
	}
	public RestApi(String code, T result) {
		this.code = code;
		this.result = result;
	}
	public RestApi(String code, String msg) {
		this(code);
		this.msg = msg;
	}
	public RestApi(String code, T result, String msg) {
		this(code,msg);
		this.result = result;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
