package com.webfullstackdev.javatechie.spbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfullstackdev.javatechie.spbms.Entity.Payment;
import com.webfullstackdev.javatechie.spbms.repository.PaymentRepository;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	public Payment savePaymentService(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());  // call this payment status - complete payment details
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}

	// this api should be 3rd aprty pyament gateway result ->payU, citrus, etc
	public String paymentProcessing(){
		return new Random().nextBoolean()? "Success" : "False";

	}
}
