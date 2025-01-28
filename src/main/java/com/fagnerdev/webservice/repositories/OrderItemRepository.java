package com.fagnerdev.webservice.repositories;

import com.fagnerdev.webservice.entities.OrderItem;
import com.fagnerdev.webservice.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
