package com.fagnerdev.webservice.repositories;

import com.fagnerdev.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
