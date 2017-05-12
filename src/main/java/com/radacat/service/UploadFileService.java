package com.radacat.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.radacat.domain.UploadFile;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月1日 上午1:05:01
 * @version: V1.0
 */
public interface UploadFileService {
	String saveFile(UploadFile uploadFile,MultipartFile file,String realpath) throws IllegalStateException, IOException;
}
