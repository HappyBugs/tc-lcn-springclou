package com.likuncheng.entity;

import lombok.Data;

@Data
public class User2 {
	
	private Integer id;
	private String userName;
	private String phone;
	private String passWord;
	
	public User2() {}
	
	public User2(String userName,String phone,String passWord) {
		this.userName = userName;
		this.phone = phone;
		this.passWord = passWord;
	}

}
