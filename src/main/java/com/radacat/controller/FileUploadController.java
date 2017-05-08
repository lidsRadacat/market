package com.radacat.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.radacat.api.RestApi;
import com.radacat.api.StatusCode;
import com.radacat.domain.UploadFile;
import com.radacat.service.UploadFileService;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年4月28日 上午9:02:43
 * @version: V1.0
 */
@Controller
@RequestMapping(value = "/file")
public class FileUploadController extends BaseController{
	 
	@Autowired
	UploadFileService uploadFileService;
	/**
	 * 文件上传具体实现方法（单文件上传）
	 * 此方法的描述是：
	 */
	@RequestMapping(value = "upload")
	@ResponseBody
	public RestApi<String> upload(@RequestParam("uid") int uid,
			@RequestParam("name") String name,
			@RequestParam("type") String type,
			@RequestParam("lastModifiedDate") Date lastModifiedDate,
			@RequestParam("size") Double size,
			@RequestParam("file") MultipartFile file,HttpServletRequest request) {
	     if (file.isEmpty()) {
	    	 return new RestApi<>(StatusCode._40010.getCode(),StatusCode._40010.getMessage());
	     }
	     // 获取文件名
	     String fileName = file.getOriginalFilename();
	     System.out.println("上传的文件名为：" + fileName);
	     // 获取文件的后缀名
	     String suffixName = fileName.substring(fileName.lastIndexOf("."));
//	     System.out.println("上传的后缀名为：" + suffixName);
	     String realpath = request.getSession().getServletContext().getRealPath("/upload");  
//	     System.out.println(realpath);  
//	     System.out.println(file.getName());//获取attach的属性名称，也就是前台表单的名称  
//	     System.out.println(file.getOriginalFilename());//获取上传文件的名称  
//	     System.out.println(file.getContentType());//获取上传文件的类型
	     // 文件上传路径
	     String filePath = realpath+"/product/";
	     // 解决中文问题，liunx下中文路径，图片显示问题
	     fileName = UUID.randomUUID() + fileName;
	    
	     File dest = new File(filePath + fileName);
	     // 检测是否存在目录
	     if (!dest.getParentFile().exists()) {
	         dest.getParentFile().mkdirs();
	     }
	     UploadFile uploadFile = new UploadFile(uid,name,type,lastModifiedDate,size);
	     uploadFile.setUrl(dest.getPath());
	     uploadFile.setSuffixName(suffixName);
	     uploadFile.setOwnerUid(getUid(request));
	     try {
	         file.transferTo(dest);
	         uploadFileService.add(uploadFile);
	         return new RestApi<>(StatusCode._20000.getCode(),"/upload/product/"+fileName,StatusCode._20000.getMessage());
	     } catch (IllegalStateException e) {
	         e.printStackTrace();
	         return new RestApi<>(StatusCode._10000.getCode());
	     } catch (IOException e) {
	         e.printStackTrace();
	         return new RestApi<>(StatusCode._10000.getCode());
	     } catch(Exception e){
	    	 e.printStackTrace();
	         return new RestApi<>(StatusCode._10000.getCode());
	     }
	}

	/**
	 * 多文件上传 主要是使用了MultipartHttpServletRequest和MultipartFile
	 *
	 * @param request
	 * @return
	 * 
	 */
	@RequestMapping(value = "/upload/batch", method = RequestMethod.POST)
	public @ResponseBody RestApi<String> batchUpload(HttpServletRequest request) {
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
		MultipartFile file = null;
		for (int i = 0; i < files.size(); ++i) {
			file = files.get(i);
			if (!file.isEmpty()) {
				String fileName = file.getOriginalFilename();
				String realpath = request.getSession().getServletContext().getRealPath("/upload");
				// 文件上传路径
				String filePath = realpath+"/product/";
				// 解决中文问题，liunx下中文路径，图片显示问题
				fileName = UUID.randomUUID() + fileName;
				
				File dest = new File(filePath + fileName);
				// 检测是否存在目录
				if (!dest.getParentFile().exists()) {
					dest.getParentFile().mkdirs();
				}
				try {
					// 获取文件名
					file.transferTo(dest);
					return new RestApi<>(StatusCode._20000.getCode());
//			        return "上传成功";
//					byte[] bytes = file.getBytes();
//					stream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
//					stream.write(bytes);
//					stream.close();
				} catch (IllegalStateException e) {
			        e.printStackTrace();
			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			} else {
				return new RestApi<>(StatusCode._40010.getCode(),StatusCode._40010.getMessage());
			}
		}
		return new RestApi<>(StatusCode._10000.getCode());
	}
}
