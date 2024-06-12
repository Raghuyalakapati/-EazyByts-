package com.elearning.edutech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.edutech.entities.CourseDescription;
import com.elearning.edutech.service.CourseDescService;
	
	
	@RestController
	@RequestMapping("api/v1/coursecontent")
	@CrossOrigin
	public class CourseDescController {

	    @Autowired
	   private  CourseDescService service;

	    @PostMapping("/courseContentByCourse")
	    public List<CourseDescription> getContentByCourse(@RequestBody int courseId){
	        return service.getContentByCourse(courseId);
	    }

	    @PostMapping("/addContent")
	    public String addCourseContent(@RequestBody List<CourseDescription> contents){
	        return service.addContent(contents);
	    }   
	}

