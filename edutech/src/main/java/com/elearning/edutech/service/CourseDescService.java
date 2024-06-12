package com.elearning.edutech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.edutech.entities.CourseDescription;
import com.elearning.edutech.repos.CourseDescRepo;

@Service
public class CourseDescService {
	
	@Autowired
	private CourseDescRepo repo;

		public List<CourseDescription> getContentByCourse(int courseId) {
	        List<CourseDescription> all = repo.findAll();
	        List<CourseDescription> output = new ArrayList<>();
	        for(CourseDescription i:all){
	            if(i.getCourseId() == courseId) output.add(i);
	        }
	        return output;
	    }
		

	public String addContent(List<CourseDescription> contents) {
		 repo.saveAll(contents);
		 return "Success";
	}
	

}

