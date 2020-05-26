package com.tang.service;

import com.tang.pojo.User;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
public interface UserService {

    //参数1：当前页  参数2：每页数量
    public String getUserByPages(int page,int size);

    public String getUserById(int userId);

    public User getUserByPhone(String phone);

}
