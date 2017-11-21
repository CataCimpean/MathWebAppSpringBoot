package com.springboot.mathwebapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mathwebapp.generatedviews.UserView;
import com.springboot.mathwebapp.services.view.UserViewService;

@RestController
@RequestMapping(value = "/user")
public class UserController {


	    @Autowired
	    protected UserViewService userViewService;
	 
	    
	    @RequestMapping(value="/myDetails")
	    public  List<UserView> getAllDetailsAbouOneUserJSON() {
	    	return (List<UserView>) userViewService.getAllDetailsAboutOneUser();
	    }
	    
	    
	    @RequestMapping(value = "/searchOne", method = RequestMethod.GET)
	    @ResponseBody
	    public String isValid() {
	        return  userViewService.searchByIdIfOneUserExist().toString();
	    }
	    
	    
	    
	    @RequestMapping(value="/myGrades")
	    public  List<UserView> getGradesForOneUserJSON() {
	    	return (List<UserView>) userViewService.getGradesForOneUser();
	    }
	    
	    
	    @RequestMapping(value="/myLogDetails")
	    public List<UserView> getLogDetailsAboutOneUserJSON(){
	    	return (List<UserView>) userViewService.getLogDetailsAboutOneUser();
	    }
	    
	    

	    @RequestMapping(value="/myHomework")
	    public  List<UserView> getAllHomeworkForCurrentUserJSON() {
	    	return (List<UserView>) userViewService.getAllHomeworkForCurrentUser();
	    }
	    
	    @RequestMapping(value="/inboxMessage")
	    public  List<UserView> getAllInputMessagessForCurrentUserJSON() {
	    	return (List<UserView>) userViewService.getAllInputMessagessForCurrentUser();
	    }
	    
	    
	    @RequestMapping(value="/outboxMessage")
	    public  List<UserView> getAllOutputMessagessFromCurrentUserJSON() {
	    	return (List<UserView>) userViewService.getAllOutputMessagessFromCurrentUser();
	    }
	    
	    
	    
}