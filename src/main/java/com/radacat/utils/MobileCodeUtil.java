package com.radacat.utils;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/** 
* <p>开发公司：蓝涟科技  <p>
* <p>版权所有：蓝涟科技  <p>
* <p>地址：www.radacat.com <p>
* <p>责任人	李大双   <p> 
*		
* <p>Title：<p>
* <p>Description：<p>
* @author 李大双
* @email lids@radacat.com
* @date 2017年2月6日 上午11:24:16
* @version V1.0
* @explain 手机验证码
*/
public class MobileCodeUtil {
	public static final String URL = "http://gw.api.taobao.com/router/rest";
	public static final String APPKEYT = "23731600";//我的appkey
	public static final String SECRET = "480ccd6d174f4ed1b9b3b62951c4f99b";//App Secret
	public static final String EXTEND = "123456";//用户编号
	public static final String SMSTYPE = "normal";//默认短信格式
	public static final String SMSFREESIGNNAME = "王东阳";//短信签名名称
	public static final String SMSPARAMSTRING1 = "name";//模版内容填的值
	public static final String SMSPARAMSTRING2 = "auth_code";//模版内容填的值
	public static final String SMSTEMPLATECODE = "SMS_59780128";//模板id
	
	public static String sendAuthCode(String mobile) throws ApiException {
		String authCode = getRandom();
		System.out.println("短信验证码----------"+authCode);
		TaobaoClient client = new DefaultTaobaoClient(URL, APPKEYT, SECRET);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend(EXTEND);//用户的编号
		req.setSmsType(SMSTYPE);//默认短信格式
		req.setSmsFreeSignName(SMSFREESIGNNAME);//短信签名名称
//		req.setSmsParamString("{\""+SMSPARAMSTRING+"\":" + authCode + "}");//模版内容填的值${authCode}
		req.setSmsParamString("{\""+SMSPARAMSTRING1+"\":" + mobile + "\","+"\""+SMSPARAMSTRING2+"\":" + authCode + "}");//模版内容填的值${authCode}
		req.setRecNum(mobile);//对方手机号
		req.setSmsTemplateCode(SMSTEMPLATECODE);//模版id
		AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
		String result = rsp.getBody();//返回结果
		System.out.println("阿里大于返回结果----------"+result);
		String regResult = ".*success\":true.*";
		if (result.matches(regResult)) {
			//发送验证码成功
			return authCode.substring(1, 5);
		}else {
			//发送失败
			return "";
		}
	}
	
	// 随机生成6位随机验证码
	private static String getRandom() {
			String activeCode = "";
			for (int i = 0; i < 4; i++) {
				activeCode = activeCode + String.valueOf((int) Math.floor(Math.random() * 9 + 1));
			}
			activeCode = "\"" + activeCode + "\"";
			return activeCode;
	}
	
	public static void main(String[] args) throws ApiException {
		sendAuthCode("18394489774");
	}
}
