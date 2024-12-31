package com.fagnerdev.curso.repositories;

import com.fagnerdev.curso.entities.OrderItem;
import com.fagnerdev.curso.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
