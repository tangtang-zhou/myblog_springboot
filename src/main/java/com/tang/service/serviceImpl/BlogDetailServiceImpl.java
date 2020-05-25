package com.tang.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tang.mapper.BlogDetailMapper;
import com.tang.pojo.BlogDetail;
import com.tang.service.BlogDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private JSONObject blogJson;

    @Override
    public int saveBlog(BlogDetail blogDetail) {
        return detailMapper.insert(blogDetail);
    }

    @Override
    public String getBlogByPage(int page, int size) {
        blogJson = new JSONObject();
        Page<BlogDetail> pageBlog = new Page<>(page, size);
        detailMapper.selectPage(pageBlog,null);
        blogJson.put("blogList",pageBlog.getRecords());
        blogJson.put("total",pageBlog.getTotal());
        blogJson.put("allPage",pageBlog.getPages());
        return blogJson.toJSONString();
    }

    @Override
    public int deleteBlog(Integer blogId) {
        return detailMapper.deleteById(blogId);
    }

    @Override
    public int updateBlog(BlogDetail blogDetail) {
        return detailMapper.updateById(blogDetail);
    }


}
