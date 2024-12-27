package com.fagnerdev.curso.repositories;

import com.fagnerdev.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
