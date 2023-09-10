package com.springboot.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
Class to return course details

A course consists of
- id
- Course name
- Course author
*/
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "segc"),
                new Course(2, "Learn Spring", "segc")
        );
    }
}
