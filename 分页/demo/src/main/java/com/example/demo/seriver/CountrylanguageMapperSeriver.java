package com.example.demo.seriver;

import com.example.demo.dao.pojo.Countrylanguage;
import com.example.demo.uitl.BaseResponse;
import com.github.pagehelper.PageInfo;


public interface CountrylanguageMapperSeriver {
      
	BaseResponse<PageInfo<Countrylanguage>> getCountrylanguageMapper();
}
