package com.tang.service;

import com.tang.pojo.User;
import com.tang.util.pages.PageRequest;
import com.tang.util.pages.PageResult;

public interface UserService {

    public User getUserById(Integer id);

    // 一个作者有多个文章
    public String getUserAllBlog(User user);

    public String getUserByPhone(User user);

    public PageResult getPageUser(PageRequest pageRequest);

    public int insertUser(String phone,String password);

}
