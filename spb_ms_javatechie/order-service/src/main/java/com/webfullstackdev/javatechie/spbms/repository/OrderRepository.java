package com.webfullstackdev.javatechie.spbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webfullstackdev.javatechie.spbms.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
