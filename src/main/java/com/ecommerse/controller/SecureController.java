package com.ecommerse.controller;

import com.ecommerse.model.User;
import com.ecommerse.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/secure")
public class SecureController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/get")
    public ResponseEntity<List<User>>getAllUser(){
        return ResponseEntity.ok(userRepo.findAll());
    }
    @GetMapping("/home")
    public String homePage(){
        return "Aao Aao Loot Machao...";
    }
}
