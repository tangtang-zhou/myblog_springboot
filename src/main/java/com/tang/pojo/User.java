package com.tang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uid;
    private String phone;
    private String name;
    private String password;
    private String email;
    private Integer sex;
    private String birth;
    private List<Detail> detailList;
}
