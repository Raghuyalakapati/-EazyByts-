package com.elearning.edutech.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.edutech.entities.Course;
import com.elearning.edutech.repos.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo repo;
	
	//addCourse
	 public Integer createCourse(Course course) {
	        return repo.save(course).getCourseId();
	    }

	 //getAll
	    public List<Course> getAllCourses() {
	        return repo.findAll();
	    }

     //getById
		public String getCourseById(Integer courseId) {
		        try{
		            return repo.findById(courseId).get().toString();
		        }
		        catch(NoSuchElementException e){
		            return new Course().toString();
		        }
			}
		}
	    
