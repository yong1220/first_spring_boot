package com.cy.first_springboot.pojo;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    //学生姓名
    private String name;
    //学生年龄
    private int age;
    //学生班级
    private String grade;
}
