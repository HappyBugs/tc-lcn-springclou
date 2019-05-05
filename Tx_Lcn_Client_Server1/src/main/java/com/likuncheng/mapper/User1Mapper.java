package com.likuncheng.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.likuncheng.entity.User1;

@Mapper
public interface User1Mapper {
	
	public void addUser(User1 user);

}
