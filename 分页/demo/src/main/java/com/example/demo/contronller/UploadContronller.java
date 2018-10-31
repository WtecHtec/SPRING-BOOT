package com.example.demo.contronller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.pojo.Upload;
import com.example.demo.seriver.UploadSeriver;
import com.example.demo.uitl.BaseResponse;
@RestController
@RequestMapping("/upload")
public class UploadContronller {

	@Autowired
	private UploadSeriver uploadSeriver;
	
    @ResponseBody
	@RequestMapping("/insertUpload")
	public BaseResponse<Integer>  insertUpload( @RequestBody Upload upload){
    	System.out.println(upload.getImageurl() +"图片URL");
		BaseResponse<Integer> response = new BaseResponse<>();
		int i = uploadSeriver.insertUpload(upload);
		if (i != 0 ) {
			response.setStatusCode(200);
		} else {
			response.setStatusCode(201);
		}
		return response;
	}
    @ResponseBody
   	@RequestMapping("/selectAlllist")
   	public BaseResponse<List<Upload>>  selectAlllist(){
    	System.out.println("所有");
   		BaseResponse<List<Upload>> response = new BaseResponse<>();
   		List<Upload> list = new ArrayList<>();
   		list= uploadSeriver.selectAllList();
   		if (list.size() > 0 ) {
   			response.setResponseData(list);
   			response.setStatusCode(200);
   		} else {
   			response.setStatusCode(201);
   		}
   		return response;
   	}
}
