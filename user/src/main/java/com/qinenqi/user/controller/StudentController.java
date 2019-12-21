package com.qinenqi.user.controller;



import com.qinenqi.common.entry.Student;
import com.qinenqi.user.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentController")
public class StudentController {
    @Autowired
    private StudentMapper userMapper;

    @GetMapping("/testUser01")
    public String testUser01(){

        List<Student> lists = userMapper.select();
        return lists.toString();
    }
}
