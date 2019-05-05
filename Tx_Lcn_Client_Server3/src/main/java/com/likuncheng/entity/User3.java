package com.likuncheng.entity;

import lombok.Data;

@Data
public class User3 {
	
	private Integer id;
	private String userName;
	private String phone;
	private String passWord;
	
	public User3() {
	}
	
	public User3(String userName,String phone,String passWord) {
		this.userName = userName;
		this.phone = phone;
		this.passWord = passWord;
	}

}
