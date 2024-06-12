package com.elearning.edutech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.edutech.entities.CourseDescription;

@Repository
public interface CourseDescRepo extends JpaRepository<CourseDescription,Integer>{
	
}
