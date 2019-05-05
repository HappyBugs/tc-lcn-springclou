package com.likuncheng.serverImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.likuncheng.entity.User1;
import com.likuncheng.feign.User2Feign;
import com.likuncheng.feign.User3Feign;
import com.likuncheng.mapper.User1Mapper;
import com.likuncheng.server.User1Server;

@Service
public class User1ServerImpl implements User1Server {
	
	@Autowired
	private User1Mapper userMapper;
	
	@Autowired
	private User2Feign user2Feign;
	
	@Autowired
	private User3Feign user3Feign;
	

	//分布式事务 如果没有分布式事务就创建分布式事务 如果有就加入分布式事务
	@TxcTransaction(propagation = DTXPropagation.REQUIRED)
	@Transactional
	@Override
	public void addUser(User1 user) {
		//自己添加新的信息
		userMapper.addUser(user);
		String rpcUser2 = user2Feign.rpcUser2("王五1", "12348597484", "123456");
		String rpcUser3 = user3Feign.rpcUser3("张三1", "14859684745", "123456");
		System.out.println("rpcUser2返回值： "+rpcUser2+"  rpcUser3返回值：  "+rpcUser3);
	}

}
