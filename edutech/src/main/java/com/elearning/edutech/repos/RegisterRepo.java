package com.elearning.edutech.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.edutech.entities.RegisterUsers;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterUsers,Integer> {

	RegisterUsers findByUserEmailAndPassword(String userEmail, String password);


}
