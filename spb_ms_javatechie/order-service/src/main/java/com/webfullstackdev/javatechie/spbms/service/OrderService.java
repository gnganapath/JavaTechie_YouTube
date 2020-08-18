package com.webfullstackdev.javatechie.spbms.service;

import com.webfullstackdev.javatechie.spbms.common.Payment;
import com.webfullstackdev.javatechie.spbms.common.TransactionRequest;
import com.webfullstackdev.javatechie.spbms.common.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfullstackdev.javatechie.spbms.entity.Order;
import com.webfullstackdev.javatechie.spbms.repository.OrderRepository;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest request) {
		//return orderRepository.save(order);
		// make an additional API call to the payment api details related to this order

		String response = "";
		Order order = request.getOrder();
		// format the request whic expects from payment transaction also
		Payment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());

		//rest call for transaction -> payment spb
		//restTemplate.post -> payment api is POSTMapping at payment service  ( 1.url of the payment service, 2. customised Payment class in order -> common-> , 3. other API expected rest java class)
		Payment paymentResponse =  restTemplate.postForObject("http://localhost:9092/payment/doPayment", payment, Payment.class);

		response = paymentResponse.getPaymentStatus().equals("success")?"Payment processing successful  order placed" : "Order failed to payment processing";
		orderRepository.save(order);
		return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);
	}
}
