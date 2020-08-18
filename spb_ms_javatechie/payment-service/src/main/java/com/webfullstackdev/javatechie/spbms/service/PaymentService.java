package com.webfullstackdev.javatechie.spbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfullstackdev.javatechie.spbms.Entity.Payment;
import com.webfullstackdev.javatechie.spbms.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	public Payment savePaymentService(Payment payment) {
		return paymentRepository.save(payment);
	}
	
}
