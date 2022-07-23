package com.michael.controller;

import com.michael.entity.Gender;
import com.michael.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {



    @GetMapping
    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student(1L,
                        "Michael",
                        "michael@gmail.com",
                        Gender.MALE),
                new Student(2L,
                        "Alex",
                        "alex@gmail.com",
                        Gender.MALE)
        );
    }


}
