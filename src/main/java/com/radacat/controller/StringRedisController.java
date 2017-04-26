package com.radacat.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radacat.domain.Product;
import com.radacat.domain.User;

/**
 * 文件名: StringRedisController.java
 * 项目名: spring-boot-sample-Redis
 * 包名: com.example
 * 描述: 
 * 作者: 李大双
 * 日期: 2017年4月10日 下午3:16:53
 * 版本: V1.0
 */
@RestController  
public class StringRedisController {  
      
    protected static Logger logger=LoggerFactory.getLogger(StringRedisController.class);  
      
    @Autowired  
    StringRedisTemplate stringRedisTemplate;  
    
    @Resource(name="stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;  

    @Resource(name="redisTemplate")
    ValueOperations<Object,Object> valOps;
      
    @RequestMapping("set")  
    public String setKeyAndValue(String key,String value){  
        logger.debug("访问set:key={},value={}",key,value);  
        valOpsStr.set(key, value);  
        return "Set Ok";
    }  
      
    @RequestMapping("get")  
    public String getKey(String key){  
        logger.debug("访问get:key={}",key);  
        return valOpsStr.get(key);  
    }
    @RequestMapping("setU")
    public String setuser(){
    	User user = new User();
    	user.setLogin("lids");
    	valOps.set(user.getLogin(), user);
    	return "OK";
    }
    @RequestMapping("getU")
    public String getuser(){
    	User user = new User();
    	user.setLogin("lids");
    	user.setPassword("1231432");
    	User uservo = (User)valOps.get(user.getLogin());
    	System.out.println(uservo);
    	return uservo.getLogin();
    }
    @RequestMapping("setP")
    public String setProduct(){
    	Product product = new Product();
    	product.setId(1);
    	valOps.set(product.getId().toString(), product);
    	return "OK";
    }
}  

