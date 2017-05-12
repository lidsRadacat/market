package com.radacat.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.radacat.domain.UploadFile;
import com.radacat.state.FileUploadContext;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月1日 上午1:05:19
 * @version: V1.0
 */
@Service
public class UploadFileServiceImpl implements UploadFileService{
	
	@Autowired
	FileUploadContext fileUploadContext;

	@Override
	public String saveFile(UploadFile uploadFile,MultipartFile file,String realpath) throws IllegalStateException, IOException{
		uploadFile.setUrl(realpath);
		fileUploadContext.contextUploedFile(uploadFile, file);
		return uploadFile.getUrl().substring(realpath.length()+1,uploadFile.getUrl().length()).replace("\\", "//");
	}
	
	
}
