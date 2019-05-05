package com.likuncheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.likuncheng.entity.User3;
import com.likuncheng.serverImpl.User3ServerImpl;

@RestController
public class User3Controller {
	
	@Autowired
	private User3ServerImpl user2ServerImpl;

	
	@PostMapping(value="rpcUser3")
	public String rpcUser2(@RequestParam("userName") String userName, @RequestParam("phone") String phone,
			@RequestParam("passWord") String passWord) {
		System.out.println("我是属于server3中的，我在执行新增user3的动作");
		User3 user3 = new User3(userName,phone,passWord);
		user2ServerImpl.addUser(user3);
		int i = 1/0;
		return user3.getId().toString();
	}

}
