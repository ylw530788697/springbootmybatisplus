package com.evan.swaggerdemo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/08/30 14:15
 */
@ApiModel(value="UserListRes", description="查询用户列表入参")
@Data
public class UserListRes implements Serializable {
    @ApiModelProperty(value = "用户名称")
    private String name;

    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ApiModelProperty(value = "分数")
    private Integer score;

    @ApiModelProperty(value = "课程")
    private String course;
}
