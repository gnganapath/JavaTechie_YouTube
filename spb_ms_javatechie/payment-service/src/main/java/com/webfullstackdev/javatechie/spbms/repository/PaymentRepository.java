package com.webfullstackdev.javatechie.spbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webfullstackdev.javatechie.spbms.Entity.Payment;

public interface PaymentRepository extends JpaRepository < Payment , Integer>{	


}
