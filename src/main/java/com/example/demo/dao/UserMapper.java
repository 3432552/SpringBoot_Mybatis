package com.example.demo.dao;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wzh
 * @ClassName: UserMapper
 * @Description:
 * @Date: 2019/8/10 12:15
 */
public interface UserMapper {
    //查询全部
    List<Student> userList();
    //多查
    Student selectTwo(@Param("name") String name,@Param("course") String course);
    //单查
    Student selectOne(String name);
    //新增
    int insertStu(Student student);

}
