package com.tang.service.serviceImpl;

import com.tang.mapper.DetailMapper;
import com.tang.pojo.Detail;
import com.tang.pojo.Sort;
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
    public List<Detail> getAllDetail() {
        return detailMapper.getAllDetail();
    }

    @Override
    public int insertDetail(Detail detail) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
        detail.setTime(dateFormat.format(date));
        System.out.println(detail);
        return detailMapper.insertBlog(detail);
    }

    @Override
    public List<Sort> getAllLabel() {
        return detailMapper.getAllLabel();
    }
}
