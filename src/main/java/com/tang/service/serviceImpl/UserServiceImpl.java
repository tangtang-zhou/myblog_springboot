package com.tang.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tang.mapper.UserMapper;
import com.tang.pojo.User;
import com.tang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    private JSONObject userJson;

    @Override
    public String getUserByPages(int page,int size) {//参数1：当前页  参数2：每页数量
        userJson = new JSONObject();
        Page<User> pageUser = new Page<>(page, size);
        userMapper.selectPage(pageUser,null);
        List<User> userPageList = pageUser.getRecords();
        long total = pageUser.getTotal(); // 总数

        userJson.put("userList",userPageList);
        userJson.put("total",total);
        userJson.put("allPage",pageUser.getPages());
        return userJson.toJSONString();
    }

    @Override
    public String getUserById(int userId) {
        userJson = new JSONObject();
        userJson.put("user",userMapper.selectById(userId));
        return userJson.toJSONString();
    }
}
