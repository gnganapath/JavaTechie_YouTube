package com.webfullstackdev.javatechie.spbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.webfullstackdev.javatechie.spbms.Entity.Payment;
import com.webfullstackdev.javatechie.spbms.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment paymentDetails) {
		return paymentService.savePaymentService(paymentDetails);
	}


	// to verify the API gate micro service adding new payment service api
    @GetMapping("/{orderId}")
    public Payment findOrder(@PathVariable int orderId){
	    return paymentService.findOrderHistoryById(orderId);
    }
}
