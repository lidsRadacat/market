package com.radacat.state;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.radacat.domain.UploadFile;
import com.radacat.mapper.UploadFileMapper;
import com.radacat.utils.IdWorker;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月9日 下午5:46:12
 * @version: V1.0
 */
@Component(value="productFileUploadStrategy")
public class ProductFileUploadStrategy implements FileUploadStrategy{

	@Autowired
	UploadFileMapper uploadFileMapper;
	
	@Autowired
	IdWorker idWorker;
	
	@Override
	public void uploadFile(UploadFile uploadFile, MultipartFile file) throws IllegalStateException, IOException {
		// 获取文件名
		String fileName = UUID.randomUUID() + file.getOriginalFilename();
		// 获取文件的后缀名
		String suffixName = fileName.substring(fileName.lastIndexOf("."));
		// 文件上传路径
		String filePath = uploadFile.getUrl()+"/product/";
		// 解决中文问题，liunx下中文路径，图片显示问题	    
		File dest = new File(filePath + fileName);
		// 检测是否存在目录
		if (!dest.getParentFile().exists()) {
		    dest.getParentFile().mkdirs();
		}
		uploadFile.setUrl(dest.getPath());
		uploadFile.setSuffixName(suffixName);
		file.transferTo(dest);
		System.out.println("上传商品");
	}

	@Override
	public void add(UploadFile uploadFile) {
		uploadFile.setId(idWorker.nextId());
		uploadFile.setCreateDate(new Date());
		uploadFile.setWriteDate(new Date());
		uploadFileMapper.insert(uploadFile);
	}
}
