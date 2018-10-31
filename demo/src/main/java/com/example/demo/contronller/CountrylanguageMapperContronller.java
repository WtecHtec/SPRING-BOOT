package com.example.demo.contronller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.pojo.Countrylanguage;
import com.example.demo.seriver.CountrylanguageMapperSeriver;
import com.example.demo.uitl.BaseResponse;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/CountrylanguageMapper")
public class CountrylanguageMapperContronller {

	@Autowired
	CountrylanguageMapperSeriver  countrylanguageMapperSeriver;
	
	@RequestMapping("/pageifoCountrylanguageMapper")
	public BaseResponse<PageInfo<Countrylanguage>> pageifoCountrylanguageMapper(){
		
		return countrylanguageMapperSeriver.getCountrylanguageMapper();
	}
	
}
