package com.elearning.edutech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.edutech.entities.RegisterUsers;
import com.elearning.edutech.repos.RegisterRepo;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepo repo;

	//saving data from fronted
	public RegisterUsers saveAccount(RegisterUsers ru) {
		return repo.save(ru);
	}

	public RegisterUsers loginAccount(RegisterUsers ru) {
        String userEmail = ru.getEmail();
        String password = ru.getPassword();
        RegisterUsers user = repo.findByUserEmailAndPassword(userEmail, password);

        if (user != null) {
            return user;
        } else {
            // Handle the case where the user is not found
            throw new RuntimeException("Invalid email or password");
        }
    }
}
