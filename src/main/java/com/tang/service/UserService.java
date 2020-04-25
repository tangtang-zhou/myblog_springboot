package com.tang.service;

import com.alibaba.fastjson.JSONObject;
import com.tang.mapper.UserMapper;
import com.tang.pojo.User;
import com.tang.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public String getUserById(User user) {
        User userForBase = userMapper.getUserById(user.getId());
        JSONObject jsonObject = new JSONObject();
        if (userForBase == null){
            jsonObject.put("message","登录失败，用户不存在");
            return jsonObject.toJSONString();
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())) {
                jsonObject.put("message", "登录失败,密码错误");
                return jsonObject.toJSONString();
            } else {
                String token = TokenUtil.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("userForBase", userForBase);
                return jsonObject.toJSONString();
            }
        }
    }
}
