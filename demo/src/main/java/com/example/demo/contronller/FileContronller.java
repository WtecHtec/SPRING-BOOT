package com.example.demo.contronller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.pojo.Upload;
import com.example.demo.seriver.UploadSeriver;
import com.example.demo.uitl.BaseResponse;

@RestController
@RequestMapping("/file")
public class FileContronller {
	@Autowired
	private UploadSeriver uploadSeriver;
	// 上传文件
    @ResponseBody
	@RequestMapping("/fileupload")
	public BaseResponse<String> fileupload( MultipartFile file){
		BaseResponse<String> response = new BaseResponse<>();
		 //获取项目编译之后的文件路径，一般是“项目路径/target/classes”
        String Path = (String.valueOf(Thread.currentThread().getContextClassLoader().getResource("")+"assets")).replaceAll("file:/", "").replaceAll("%20", " ").trim();
		if(file.isEmpty()) {
			response.setStatusCode(201);
		}
		System.out.println(Path);
		String filename = file.getOriginalFilename();
		int size = (int)file.getSize();
		File dest = new File(Path+"/"+filename);
		if(!dest.getParentFile().exists()) {
			dest.getParentFile().mkdirs();
		}
		try {
			file.transferTo(dest);
			Upload upload = new Upload();
			upload.setImageurl("http://localhost:8200/assets/"+filename);
			uploadSeriver.insertUpload(upload);
			response.setStatusCode(200);
			return response;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatusCode(201);
			return response;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setStatusCode(201);
			return response;
		}

	}
	
}
