package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.util.List;

/**
 * @Author: wzh
 * @ClassName: TestController
 * @Description:
 * @Date: 2020/3/3 23:33
 */
@Controller
public class TestController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/a")
    @ResponseBody
    public List<Student> index(Model model) {
        List<Student> list = userMapper.userList();
        model.addAttribute("s", list);
        return list;
    }
}
