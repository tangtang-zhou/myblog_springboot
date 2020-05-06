package com.tang.mapper;

import com.tang.pojo.Detail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DetailMapper {

    public List<Detail> getAllDetail();

    public int insertBlog(Detail detail);

}
