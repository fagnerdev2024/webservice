package com.fagnerdev.curso.repositories;

import com.fagnerdev.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
