package com.likuncheng.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.likuncheng.entity.User3;

@Mapper
public interface User3Mapper {
	
	public void addUser(User3 user);

}
