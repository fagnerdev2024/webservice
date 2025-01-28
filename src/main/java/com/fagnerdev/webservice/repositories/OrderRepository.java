package com.fagnerdev.webservice.repositories;

import com.fagnerdev.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
