package com.tang.mapper;

import com.tang.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    public User getUserByPhone(String phone);

}
