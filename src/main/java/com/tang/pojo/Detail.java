package com.tang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
    private Integer id;
    private String title;
    private User user;
    private String label;
    private String content;
    private String comment;
    private String heat;
}
