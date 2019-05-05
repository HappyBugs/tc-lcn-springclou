package com.likuncheng.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="txlcn-demo-spring-service-3")
@Service
public interface User3Feign {
	
	@PostMapping(value="rpcUser3")
	public String rpcUser3(@RequestParam("userName") String userName, @RequestParam("phone") String phone,
			@RequestParam("passWord") String passWord);

}
