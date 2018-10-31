package com.example.demo.seriver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.UploadMapper;
import com.example.demo.dao.pojo.Upload;

@Service
public class UploadSeriverImpl  implements UploadSeriver{
      
	@Autowired
	private UploadMapper uploadMapper;
	
	@Override
	public int insertUpload(Upload upload) {
		// TODO Auto-generated method stub
		upload.setCreateTime(new Date());
		upload.setDelFlg(0);
		 int i=uploadMapper.insert(upload);
		 return i;
	}

	@Override
	public List<Upload> selectAllList() {
		// TODO Auto-generated method stub
		List<Upload> list = new ArrayList<>();
		list = uploadMapper.selectAll();
		return list;
	}

}
