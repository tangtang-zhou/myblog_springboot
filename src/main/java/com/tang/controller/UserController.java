package com.tang.controller;


import com.alibaba.fastjson.JSONObject;
import com.tang.pojo.User;
import com.tang.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/admin/login")
    @ResponseBody
    public String adminLogin (@RequestParam String userPhone, @RequestParam String password) {
        JSONObject jsonObject = new JSONObject();
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(userPhone,password);
        //执行登录，如果没有异常就说明ok
        try {
            subject.login(token);
            jsonObject.put("msg","登录成功");
        } catch (UnknownAccountException e){// 用户名不存在
            jsonObject.put("msg","用户名不存在");
        } catch (IncorrectCredentialsException e){// 密码错误
            jsonObject.put("msg","密码错误");
        }
        return jsonObject.toJSONString();
    }

}

