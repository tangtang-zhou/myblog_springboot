package com.tang.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.mapper.UserMapper;
import com.tang.pojo.User;
import com.tang.service.UserService;
import com.tang.util.TokenUtil;
import com.tang.util.pages.PageRequest;
import com.tang.util.pages.PageResult;
import com.tang.util.pages.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String getUserById(User user) {
        User userForBase = userMapper.getUserByPhone(user.getPhone());
        JSONObject jsonObject = new JSONObject();
        if (userForBase == null) {
            jsonObject.put("message", "登录失败，用户不存在");
            return jsonObject.toJSONString();
        } else {
            if (!userForBase.getPassword().equals(user.getPassword())) {
                jsonObject.put("message", "登录失败,密码错误");
                return jsonObject.toJSONString();
            } else {
                String token = TokenUtil.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("userId", userForBase.getUid());
                return jsonObject.toJSONString();
            }
        }
    }

    @Override
    public PageResult getPageUser(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    @Override
    public int insertUser(String phone, String password) {
        return userMapper.insertUser(phone, password);
    }

    private PageInfo<User> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<User> sysMenus = userMapper.getPageUser();
        return new PageInfo<User>(sysMenus);
    }
}
