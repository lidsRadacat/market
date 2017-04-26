package com.radacat.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  
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
* @date 2017年1月5日 下午3:21:43
* @version 
* @explain 
*/
public class LoggerUtil {
	//使用slf4j创建日志对象，好处时，以后更换为其它日志工具时，只要修改配置文件，不用修改代码  
    private static Logger logger = LoggerFactory.getLogger(LoggerUtil.class);
    /**
     * 
     * @Title: warn
     * @author: 李大双
     * @Description: 输出警告级别的日志
     * @param message
     * @return: void
     */
    public static  void warn(String  message){
    	logger.warn(message);
    }
    /**
     * 
     * @Title: error 
     * @author: 李大双
     * @Description: 输出错误级别日志
     * @param message 日志信息
     * @return: void
     */
    public static void error(String message) {  
        logger.error(message);  
    }
    /**
     * 
     * @Title: debug 
     * @author: 李大双
     * @Description: 输出debug级别的日志
     * @param message 日志信息
     * @return: void
     */
    public static void debug(String message) {  
        logger.debug(message);  
    }
    /**
     * 
     * @Title: info 
     * @author: 李大双
     * @Description: 输出信息级别的日志
     * @param message 日志信息
     * @return: void
     */
    public static void info(String message) {  
        logger.info(message);
    }  
}
