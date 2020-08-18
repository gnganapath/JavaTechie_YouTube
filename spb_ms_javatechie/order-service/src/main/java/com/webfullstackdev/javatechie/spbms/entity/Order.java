package com.webfullstackdev.javatechie.spbms.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name ="ORDER_TB")

// lombok import to avoid create construtor, getter /setter

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int qty;
	private double price;
	

}
