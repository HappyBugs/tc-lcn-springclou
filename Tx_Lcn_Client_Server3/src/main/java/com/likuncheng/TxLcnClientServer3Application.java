package com.likuncheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;

@SpringBootApplication
@EnableEurekaClient
//分布式事务 tc-lcn 客户端
@EnableDistributedTransaction
@EnableFeignClients
public class TxLcnClientServer3Application {
	
	public static void main(String[] args) {
		SpringApplication.run(TxLcnClientServer3Application.class, args);
	}
	
	

}
