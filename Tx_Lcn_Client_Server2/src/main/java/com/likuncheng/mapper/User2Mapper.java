package com.likuncheng.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.likuncheng.entity.User2;

@Mapper
public interface User2Mapper {
	
	public void addUser(User2 user2);

}
