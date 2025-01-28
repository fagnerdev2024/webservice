package com.fagnerdev.webservice.repositories;

import com.fagnerdev.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
