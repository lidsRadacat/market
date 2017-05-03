package com.radacat.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radacat.domain.UploadFile;
import com.radacat.mapper.UploadFileMapper;
import com.radacat.utils.IdWorker;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月1日 上午1:05:19
 * @version: V1.0
 */
@Service
public class UploadFileServiceImpl implements UploadFileService{

	@Autowired
	UploadFileMapper uploadFileMapper;
	
	@Autowired
	IdWorker idWorker;
	
	@Override
	public void add(UploadFile uploadFile) {
		uploadFile.setId(idWorker.nextId());
		uploadFile.setCreateDate(new Date());
		uploadFile.setWriteDate(new Date());
		uploadFileMapper.insert(uploadFile);
	}
}
