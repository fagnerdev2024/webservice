package com.fagnerdev.curso.repositories;

import com.fagnerdev.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
