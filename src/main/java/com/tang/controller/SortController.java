package com.tang.controller;

import com.tang.pojo.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sort")
public class SortController {

    /*@Autowired
    DetailService detailService;

    @GetMapping("/getAllLabel")
    public List<Sort> getAllLabel(){
        return detailService.getAllLabel();
    }*/
}
