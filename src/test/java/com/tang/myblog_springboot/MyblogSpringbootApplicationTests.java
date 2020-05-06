package com.tang.myblog_springboot;

import com.tang.mapper.FileMapper;
import com.tang.mapper.UserMapper;
import com.tang.pojo.Img;
import com.tang.pojo.User;
import com.tang.service.DetailService;
import com.tang.service.FileService;
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
    @Autowired
    FileService fileService;

    @Test
    void contextLoads() {
        Img img = new Img();
        img.setUrl("123456");

        System.out.println(fileService.insertUrl(img));
        System.out.println(img.getId());
    }

}
