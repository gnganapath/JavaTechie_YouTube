package com.webfullstackdev.javatechie.spbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
