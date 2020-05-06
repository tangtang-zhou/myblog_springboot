package com.tang.service.serviceImpl;

import com.tang.mapper.DetailMapper;
import com.tang.pojo.Detail;
import com.tang.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    DetailMapper detailMapper;

    @Override
    public void getDetail() {
        List<Detail> detailList = detailMapper.getAllDetail();
        for (Detail detail : detailList) {
            System.out.println(detail);
        }
    }

    @Override
    public int insertDetail(Detail detail) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
        detail.setTime(dateFormat.format(date));
        System.out.println(detail);
        return detailMapper.insertBlog(detail);
    }
}
