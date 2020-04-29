package com.tang.myblog_springboot;

import com.tang.mapper.UserMapper;
import com.tang.pojo.User;
import com.tang.service.DetailService;
import com.tang.service.UserService;
import com.tang.service.serviceImpl.UserServiceImpl;
import com.tang.util.pages.PageRequest;
import com.tang.util.pages.PageResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyblogSpringbootApplicationTests {
    @Autowired
    DetailService detailService;

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        //detailService.getDetail();
        /*List<User> allUser = userMapper.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }*/
        /*User userById = userMapper.getUserById(1);
        System.out.println(userById);*/
        PageResult pageUser = userService.getPageUser(new PageRequest(1, 2));
        System.out.println(pageUser);


    }

}
