package com.likuncheng.serverImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.likuncheng.entity.User2;
import com.likuncheng.mapper.User2Mapper;
import com.likuncheng.server.User2Server;

@Service
public class User2ServerImpl implements User2Server {
	
	@Autowired
	private User2Mapper userMapper;
	

	//分布式事务 如果没有分布式事务就创建分布式事务 如果有就加入分布式事务
	@TxcTransaction(propagation = DTXPropagation.SUPPORTS)
	@Transactional
	@Override
	public void addUser(User2 user2) {
		userMapper.addUser(user2);
	}

}
