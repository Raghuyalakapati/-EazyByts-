package com.elearning.edutech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elearning.edutech.entities.RegisterUsers;
import com.elearning.edutech.service.RegisterService;


@Controller
@RequestMapping("/api")
public class RegisterController {

    @Autowired
    private RegisterService service;	
    
    @PostMapping("/createAccount")
    public RegisterUsers createAccount(@RequestBody RegisterUsers ru){
        return service.saveAccount(ru);
    }

    
    @PostMapping("/login")
    public RegisterUsers loginAccount(@RequestBody RegisterUsers ru){
        return service.loginAccount(ru);
    }

}

