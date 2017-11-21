package com.springboot.mathwebapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mathwebapp.generatedviews.UserView;
import com.springboot.mathwebapp.services.view.AdminViewService;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

	

	@Autowired
	protected AdminViewService adminViewService;
	
	

    @RequestMapping(value="/getTheWholeDb")
    public  List<UserView> getTheWholeDbJSON() {
    	return (List<UserView>) adminViewService.getTheWholeDb();
    }
    
    
    
    @RequestMapping(value="/getOneUserDetails")
    public  List<UserView> getOneUserDetailsJSON() {
    	return (List<UserView>) adminViewService.getOneUserDetails();
    }
	


    @RequestMapping(value="/getOneUserGrades")
    public  List<UserView> getOneUserGradesJSON() {
    	return (List<UserView>) adminViewService.getOneUserGrades();
    }
    
    

    @RequestMapping(value="/getAllUsersGrades")
    public  List<UserView> getAllUsersGradesJSON() {
    	return (List<UserView>) adminViewService.getAllUsersGrades();
    }
    

    @RequestMapping(value="/getOneUserMessage")
    public  List<UserView> getOneUserMessageJSON() {
    	return (List<UserView>) adminViewService.getOneUserMessage();
    }
    

    @RequestMapping(value="/getAllUsersMessages")
    public  List<UserView> getAllUsersMessagesJSON() {
    	return (List<UserView>) adminViewService.getAllUsersMessages();
    }
    
    
    
    
}
