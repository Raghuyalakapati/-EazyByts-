package com.elearning.edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.edutech.entities.Course;
import com.elearning.edutech.service.CourseService;

@RestController	
@RequestMapping("/api/courses")
public class CourseController {
	
    @Autowired
    private CourseService service;

    @PostMapping("/createCourse")
    public Integer createCourse(@RequestBody Course course) {
        return service.createCourse(course);
    }

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }
    
    @PostMapping("/getById")
    public String getById(@RequestBody Course courses) {
    	return service.getCourseById(courses.getCourseId());
    	}

}
