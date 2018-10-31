package com.example.demo.seriver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.TbUerMapper;
import com.example.demo.dao.pojo.TbUer;

@Service
public class TbUerSeriverImpl implements TbUerSeriver{

	@Autowired
	private TbUerMapper tbUerMapper;
	@Override
	public List<TbUer> selectAllList() {
		// TODO Auto-generated method stub
		List<TbUer>  list=new ArrayList<>();
		list=tbUerMapper.selectAll();
		return list;
	}

}
