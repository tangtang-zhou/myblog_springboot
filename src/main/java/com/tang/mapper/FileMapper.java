package com.tang.mapper;

import com.tang.pojo.Img;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FileMapper {
    public int insertUrl(Img img);
}
