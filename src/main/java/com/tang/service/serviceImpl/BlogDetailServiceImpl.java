package com.tang.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.mapper.BlogDetailMapper;
import com.tang.pojo.BlogDetail;
import com.tang.service.BlogDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
@Service
public class BlogDetailServiceImpl implements BlogDetailService {

    @Autowired
    BlogDetailMapper detailMapper;

    @Override
    public int saveBlog(BlogDetail blogDetail) {
        return detailMapper.insert(blogDetail);
    }

    @Override
    public List<BlogDetail> getAllBlog() {
        return detailMapper.selectList(null);
    }

    @Override
    public int deleteBlog(Integer blogId) {
        return detailMapper.deleteById(blogId);
    }


}
