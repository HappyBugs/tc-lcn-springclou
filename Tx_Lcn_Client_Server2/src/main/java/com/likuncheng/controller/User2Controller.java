package com.likuncheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.likuncheng.entity.User2;
import com.likuncheng.serverImpl.User2ServerImpl;

@RestController
public class User2Controller {
	
	@Autowired
	private User2ServerImpl user2ServerImpl;

	
	@PostMapping(value="rpcUser2")
	public String rpcUser2(@RequestParam("userName") String userName, @RequestParam("phone") String phone,
			@RequestParam("passWord") String passWord) {
		System.out.println("我是属于server2中的，我在执行新增user2的动作");
		User2 user2 = new User2(userName,phone,passWord);
		user2ServerImpl.addUser(user2);
		return user2.getId().toString();
	}

}
