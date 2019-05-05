package com.likuncheng.entity;

import lombok.Data;

@Data
public class User1 {
	
	private Integer id;
	private String userName;
	private String phone;
	private String passWord;
	
	public User1() {
	}
	
	public User1(String userName,String phone,String passWord) {
		this.userName = userName;
		this.phone = phone;
		this.passWord = passWord;
	}

}
