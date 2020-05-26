package com.tang.service;

import com.tang.pojo.BlogDetail;

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
    public String getBlogByPage(int page,int size);
    public int deleteBlog (Integer blogId);
    public int updateBlog(BlogDetail blogDetail);
}
