package com.fagnerdev.curso.repositories;

import com.fagnerdev.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
