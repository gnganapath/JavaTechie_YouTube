package com.webfullstackdev.javatechie.spbms.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name="PAYMENT_TB")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private int amount;


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}
}
