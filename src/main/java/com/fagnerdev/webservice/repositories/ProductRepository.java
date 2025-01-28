package com.fagnerdev.webservice.repositories;

import com.fagnerdev.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
