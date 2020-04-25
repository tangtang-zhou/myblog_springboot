package com.tang.controller;

import com.tang.pojo.User;
import com.tang.service.UserService;
import com.tang.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Login {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String adminLogin (@RequestBody User user) {
        System.out.println(user);
        return userService.getUserById(user);
    }
    /*@GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        userService.getUserById(id);
        System.out.println();
        return null;
    }*/

}
