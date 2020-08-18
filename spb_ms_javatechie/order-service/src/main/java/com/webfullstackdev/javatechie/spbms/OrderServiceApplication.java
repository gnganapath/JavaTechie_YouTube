package com.webfullstackdev.javatechie.spbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@RestController
@EnableEurekaClient

public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced   // to understand thi has client side load balance
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	//	@RequestMapping("/")
	//	public String jtHello() {
	//		return "hello java techie";
	//	}

}
