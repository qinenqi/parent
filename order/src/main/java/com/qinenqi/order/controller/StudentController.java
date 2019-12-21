package com.qinenqi.order.controller;



import com.qinenqi.common.entry.Student;
import com.qinenqi.order.mapper.StudentMapper;
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
//        Student student = new Student();
//        student.setId("123456");
//        student.setName("秦恩啟");
//        student.setPassword("1234567");

        List<Student> lists = userMapper.select();
        return lists.toString();
    }
}
