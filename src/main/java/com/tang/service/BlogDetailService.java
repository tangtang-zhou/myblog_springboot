package com.tang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.pojo.BlogDetail;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
public interface BlogDetailService {
    public int saveBlog(BlogDetail blogDetail);
    public List<BlogDetail> getAllBlog();
    public int deleteBlog (Integer blogId);
}
