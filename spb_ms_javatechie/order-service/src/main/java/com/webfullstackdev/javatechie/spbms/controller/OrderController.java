package com.webfullstackdev.javatechie.spbms.controller;

import com.webfullstackdev.javatechie.spbms.common.Payment;
import com.webfullstackdev.javatechie.spbms.common.TransactionRequest;
import com.webfullstackdev.javatechie.spbms.common.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webfullstackdev.javatechie.spbms.entity.Order;
import com.webfullstackdev.javatechie.spbms.service.OrderService;

@RestController
@RequestMapping( "/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
	    //do the rest call for the payment api service from order service
		return orderService.saveOrder(request);
	}
	
	

}
