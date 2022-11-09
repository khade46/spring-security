package com.ecommerse.controller;

import com.ecommerse.model.User;
import com.ecommerse.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class AddUserController {
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/add")
    public String addUser(@RequestBody User user)throws Exception{
        if(user.getName()==null){
            throw new Exception("Enter your name");
        } else if (user.getUsername()==null) {
            throw new Exception("Enter Username");
        } else if (user.getPassword()==null) {
            throw new Exception("Enter password");
        } else if (user.getMobile()==null) {
            throw new Exception("Enter your contact no.");
        }
        else {
            String pwd = user.getPassword();
            String encodedPwd = encoder.encode(pwd);
            user.setPassword(encodedPwd);
            userRepo.save(user);
            return "User added successfully";
        }

    }
}
