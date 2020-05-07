package com.tang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
    private Integer bid;
    private String title;
    private String username;
    private Integer uid;
    private String time;
    private Integer sid;
    private String label;
    private String content;
    private String comment;
    private String heat;
    private String readType;
}
