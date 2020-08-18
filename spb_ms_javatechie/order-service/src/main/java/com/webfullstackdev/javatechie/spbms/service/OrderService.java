package com.webfullstackdev.javatechie.spbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfullstackdev.javatechie.spbms.entity.Order;
import com.webfullstackdev.javatechie.spbms.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public Order saveOrder( Order order) {
		return orderRepository.save(order);
		// make an additional API call to the payment api details related to this order
	}
}
