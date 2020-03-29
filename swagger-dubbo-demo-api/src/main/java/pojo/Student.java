package pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: swagger-dubbo-demo
 * @description: 学生信息
 * @author: zhaochen
 * @create: 2020-03-29 23:12
 **/
@Data
public class Student {

    @ApiModelProperty(value = "学号")
    private String id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private int age;

    @ApiModelProperty(value = "是否考试")
    private boolean test;
}
