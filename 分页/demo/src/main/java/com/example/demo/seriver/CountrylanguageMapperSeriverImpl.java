package com.example.demo.seriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.CountrylanguageMapper;
import com.example.demo.dao.pojo.Countrylanguage;
import com.example.demo.uitl.BaseResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.fabric.xmlrpc.base.Array;

@Service
public class CountrylanguageMapperSeriverImpl implements CountrylanguageMapperSeriver {

	@Autowired
	private CountrylanguageMapper countrylanguageMapper;
	
	@Override
	public BaseResponse<PageInfo<Countrylanguage>> getCountrylanguageMapper() {
		// TODO Auto-generated method stub
		BaseResponse<PageInfo<Countrylanguage>> result =new BaseResponse<>();
		PageHelper.startPage(1,10);
		List<Countrylanguage> lists = new ArrayList<>();
		
		lists = countrylanguageMapper.selectAll();
		
		PageInfo<Countrylanguage> data = new PageInfo<Countrylanguage>(lists);
		result.setResponseData(data);

		return result;
	}

}
