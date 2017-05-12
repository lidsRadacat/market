package com.radacat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月9日 下午6:50:47
 * @version: V1.0
 */
@Configuration
@ImportResource(locations={"classpath:application-bean.xml"})
public class ConfigClass {

}
