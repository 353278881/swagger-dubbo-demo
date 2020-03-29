package service;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import pojo.Student;

public interface StudentService {

    @ApiOperation(value = "查询学生信息", notes = "查询学生信息")
    Student queryStudent(@ApiParam(value = "学生id")String id, @ApiParam(value = "学生姓名")String name);

    @ApiOperation(value = "删除学生", notes = "删除学生信息")
    void deleteStudent(@ApiParam(value = "学生id") String id);

    @ApiOperation(nickname = "queryIsTestStudent", value = "查询学生", notes = "查询已经考试过的学生", response = Student.class, responseContainer = "List")
    List<Student> queryIsTestStudent();

}
