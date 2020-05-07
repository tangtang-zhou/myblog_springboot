package com.tang.service;
import com.tang.pojo.Detail;
import com.tang.pojo.Sort;

import java.util.List;


public interface DetailService {

    public List<Detail> getAllDetail();

    public int insertDetail(Detail detail);

    public List<Sort> getAllLabel();
}
