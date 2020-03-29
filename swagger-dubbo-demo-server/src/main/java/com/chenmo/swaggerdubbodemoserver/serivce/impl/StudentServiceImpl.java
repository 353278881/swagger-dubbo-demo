package com.chenmo.swaggerdubbodemoserver.serivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import io.swagger.annotations.Api;
import java.util.List;
import pojo.Student;
import service.StudentService;

/**
 * @program: swagger-dubbo-demo
 * @description:
 * @author: zhaochen
 * @create: 2020-03-29 23:22
 **/
@Api(value = "学生服务实现")
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(String id, String name) {
        return null;
    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public List<Student> queryIsTestStudent() {
        return null;
    }
}
