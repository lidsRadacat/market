package com.radacat.state;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.radacat.domain.UploadFile;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月9日 下午5:11:17
 * @version: V1.0
 */
public interface FileUploadStrategy {
	
	abstract void uploadFile(UploadFile uploadFile,MultipartFile file) throws IllegalStateException, IOException;
	
	void add(UploadFile uploadFile);
}
