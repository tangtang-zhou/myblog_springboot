package com.tang.controller;

import com.tang.pojo.Detail;
import com.tang.pojo.Img;
import com.tang.service.DetailService;
import com.tang.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    FileService fileService;
    @Autowired
    DetailService detailService;
    private String url;

    @RequestMapping(value = "/file",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String uploadFile(@RequestParam("image") MultipartFile file) {
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        fileName = new SimpleDateFormat("HHmmss").format(new Date()) + "_" + fileName;
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);
        String path = "D:/WorkAndSoftware/MySQL/image" ;
        File dest = new File(path + "/" + fileName);
        //判断文件是否已经存在
        if (dest.exists()) {
            return "文件已经存在";
        }

        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            url="http://localhost:8888/img/"+fileName;
            Img img = new Img();
            img.setUrl(url);
            fileService.insertUrl(img);
            return img.getUrl();
        } catch (IllegalStateException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }
    @RequestMapping(value = "/saveArticle")
    public int saveArticle(@RequestBody Detail blog) {
        return detailService.insertDetail(blog);
    }

    @GetMapping("/getAllArticle")
    public List<Detail> getAllArticle(){
        return detailService.getAllDetail();
    }

}
