package com.tang.controller;

import com.tang.pojo.User;
import com.tang.service.UserService;
import com.tang.util.pages.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String adminLogin (@RequestBody User user) {
        System.out.println(user);
        // 返回用户id
        return userService.getUserByPhone(user);
    }

    @GetMapping ("/register")
    public int userRegister(@RequestParam("phone")String phone, @RequestParam("password")String password){
        return userService.insertUser(phone,password);
    }

    @PostMapping("/user")
    public Object selectUsersPages(@RequestBody PageRequest pageRequest) {
        System.out.println(pageRequest);
        return userService.getPageUser(pageRequest);
    }

}
