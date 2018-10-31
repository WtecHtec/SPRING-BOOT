package com.example.demo.contronller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.pojo.TbUer;
import com.example.demo.seriver.TbUerSeriver;
import com.example.demo.uitl.BaseResponse;

@RestController
@RequestMapping("/uer")
public class TbUerContronller {
           @Autowired
           private TbUerSeriver tbUerSeriver;
	@RequestMapping("/uerall")
    public BaseResponse<List<TbUer>> uerall(){
		BaseResponse<List<TbUer>>  response = new BaseResponse<>();
		List<TbUer> data = tbUerSeriver.selectAllList();
		response.setResponseData(data);
		return response;
		
	}       
}
