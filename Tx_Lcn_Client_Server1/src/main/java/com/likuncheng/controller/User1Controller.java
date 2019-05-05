package com.likuncheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.likuncheng.entity.User1;
import com.likuncheng.serverImpl.User1ServerImpl;

@RestController
public class User1Controller {
	
	@Autowired
	private User1ServerImpl user1ServerImpl;
	
	@PostMapping(value="rpcUser1")
	public String rpcUser1(@RequestParam("userName") String userName, @RequestParam("phone") String phone,
			@RequestParam("passWord") String passWord) {
		System.out.println("测试分布式事务开始");
		User1 user1 = new User1(userName,phone,passWord);
		System.out.println(user1.toString());
		user1ServerImpl.addUser(user1);
		return user1.getId().toString()+"  测试分布式事务完毕";
	}

}
