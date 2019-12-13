package com.cy.first_springboot.controller;

import com.cy.first_springboot.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/getStudent")
    public Student getStudent(){
        return new Student("Jack",18,"泰坦一班");
    }
}
