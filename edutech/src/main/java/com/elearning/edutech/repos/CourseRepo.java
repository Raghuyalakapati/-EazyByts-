package com.elearning.edutech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.edutech.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{

}
