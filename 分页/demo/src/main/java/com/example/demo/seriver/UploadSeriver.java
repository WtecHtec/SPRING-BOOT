package com.example.demo.seriver;

import java.util.List;

import com.example.demo.dao.pojo.Upload;

public interface UploadSeriver {
  
	int insertUpload(Upload upload);
	List<Upload> selectAllList();
}
