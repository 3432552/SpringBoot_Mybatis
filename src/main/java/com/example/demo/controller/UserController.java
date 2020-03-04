package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wzh
 * @ClassName: UserController
 * @Description:
 * @Date: 2019/8/10 15:21
 */
@Controller
public class UserController {
    @Resource
    private UserMapper userMapper;
    @ResponseBody
    @RequestMapping("/selectList")
    public List<Student> selectList(Model model){
        System.out.println("selectList()===:>"+userMapper.userList());
        List<Student> list=userMapper.userList();
        model.addAttribute("s",list);
        return list;
    }
    @RequestMapping("/index")
    public String index(){
        System.out.println("测试数据");
        return "login";
    }
    @ResponseBody
    @RequestMapping("/selectTwo")
    public Student selectTwo(String name,String course){
        System.out.println("selectTwo()===:>"+userMapper.selectTwo(name, course));
        return userMapper.selectTwo(name, course);
    }
    @ResponseBody
    @RequestMapping("/selectOne")
    public Student selectOne(String name){
        System.out.println("selectOne()===:>"+userMapper.selectOne(name));
        return userMapper.selectOne(name);
    }
    @ResponseBody
    @RequestMapping("/insert")
    public boolean insert(Student student) {
        student.setName("wang");
        student.setCourse("本科");
        student.setScore(100);
        int result = userMapper.insertStu(student);
        System.out.println("result===:>"+result);
        if (result>0){
            System.out.println("新增成功!");
        }else {
            System.out.println("新增失败!");
        }
        return true;
    }
    @ResponseBody
    @RequestMapping(value="/hello/{id}")
    public String sayHello(@PathVariable("id") Integer id){
        return "id:"+id;
    }
   /* @RequestMapping(value="/hello")
    public String sayHello(@RequestParam("id") Integer id){
        return "id:"+id;
    }*/
}
