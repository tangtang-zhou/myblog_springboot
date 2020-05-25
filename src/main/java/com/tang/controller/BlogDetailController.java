package com.tang.controller;
import com.tang.pojo.BlogDetail;
import com.tang.service.BlogDetailService;
import com.tang.service.serviceImpl.BlogDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
@RestController
@RequestMapping("/blog")
public class BlogDetailController {
    @Autowired
    BlogDetailService blogDetailService;

    @RequestMapping(value = "/saveArticle")
    public int saveArticle(@RequestBody BlogDetail blog) {
        return blogDetailService.saveBlog(blog);
    }

    /*@GetMapping("/getAllArticle")
    public List<BlogDetail> getAllBlog(){
        return blogDetailService.getAllBlog();
    }*/
}

