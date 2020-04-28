package com.tang.service;

import com.tang.mapper.DetailMapper;
import com.tang.pojo.Detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {

    @Autowired
    DetailMapper detailMapper;

    public void getDetail() {
        List<Detail> detailList = detailMapper.getAllDetail();
        for (Detail detail : detailList) {
            System.out.println(detail);
        }
    }

}
