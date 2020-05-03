package com.tang.mapper;

import com.tang.pojo.Detail;
import com.tang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public User getUserById(Integer id);

    public User getUserByPhone(String phone);

    public List<User> getAllUser();

    public List<User> getPageUser();

    public int insertUser(@Param("phone")String phone, @Param("password")String password);

}
