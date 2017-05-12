package com.radacat.state;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.radacat.domain.UploadFile;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月9日 下午5:10:57
 * @version: V1.0
 */
public class FileUploadContext {
	
	Map<Integer,FileUploadStrategy> fileUploadStrategy;
	
	public Map<Integer, FileUploadStrategy> getFileUploadStrategy() {
		return fileUploadStrategy;
	}

	public void setFileUploadStrategy(Map<Integer, FileUploadStrategy> fileUploadStrategy) {
		this.fileUploadStrategy = fileUploadStrategy;
	}

	public void contextUploedFile(UploadFile uploadFile,MultipartFile file) throws IllegalStateException, IOException{
		fileUploadStrategy.get(uploadFile.getUid()).add(uploadFile);
		fileUploadStrategy.get(uploadFile.getUid()).uploadFile(uploadFile,file);
	}
}
