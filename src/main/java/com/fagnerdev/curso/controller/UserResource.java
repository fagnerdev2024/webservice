package com.fagnerdev.curso.controller;


import com.fagnerdev.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "maria", "gmail", "9999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
