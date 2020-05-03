package com.tang.service;

import com.tang.pojo.User;
import com.tang.util.pages.PageRequest;
import com.tang.util.pages.PageResult;

public interface UserService {

    public String getUserById(User user);

    public PageResult getPageUser(PageRequest pageRequest);

    public int insertUser(String phone,String password);

}
