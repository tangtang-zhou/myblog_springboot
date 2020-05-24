package com.tang.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 汤州
 * @since 2020-05-24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="BlogDetail对象", description="")
public class BlogDetail {

    @TableId(value = "blog_id", type = IdType.AUTO)
    private Integer blogId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "用户")
    private Integer userId;

    @ApiModelProperty(value = "分类")
    private String labelId;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "阅读数")
    private String heat;

    @ApiModelProperty(value = "公开类型")
    private String readType;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除")
    @TableLogic
    private Integer deleted;


}
