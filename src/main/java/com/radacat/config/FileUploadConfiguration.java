package com.radacat.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

/**
 * 文件上传配置
 * 
 */
public class FileUploadConfiguration {

	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		// 设置文件大小限制 ,超出设置页面会抛出异常信息，
		// 这样在文件上传的地方就需要进行异常信息的处理了;
		factory.setMaxFileSize("256KB"); // KB,MB
		/// 设置总上传数据总大小
		factory.setMaxRequestSize("512KB");
		// Sets the directory location where files will be stored.
		// factory.setLocation("/app/pttms/tmp");
		return factory.createMultipartConfig();
	}
}
