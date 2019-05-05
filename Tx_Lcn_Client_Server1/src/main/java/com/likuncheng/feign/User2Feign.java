package com.likuncheng.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="txlcn-demo-spring-service-2")
@Service
public interface User2Feign {
	
	@PostMapping(value="rpcUser2")
	public String rpcUser2(@RequestParam("userName") String userName, @RequestParam("phone") String phone,
			@RequestParam("passWord") String passWord);

}
