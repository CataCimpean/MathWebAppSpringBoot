package com.springboot.mathwebapp.services.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mathwebapp.generatedviews.UserView;
import com.springboot.mathwebapp.repositories.view.AdminViewRepository;

@Service
public class AdminViewService {

	@Autowired
	AdminViewRepository adminViewRepository;
	
	
	public List<UserView> getTheWholeDb(){
		return (List<UserView>)adminViewRepository.getTheWholeDb();
	}
	
	

	public List<UserView> getOneUserDetails(){
		return (List<UserView>)adminViewRepository.getOneUserDetails((Integer)2);
	}

	
	public List<UserView> getOneUserGrades(){
		return (List<UserView>)adminViewRepository.getOneUserGrades((Integer)2);
	}
	

	public List<UserView> getAllUsersGrades(){
		return (List<UserView>)adminViewRepository.getAllUsersGrades();
	}


	public List<UserView> getOneUserMessage(){
		return (List<UserView>)adminViewRepository.getOneUserMessage((Integer)2);
	}
	

	public List<UserView> getAllUsersMessages(){
		return (List<UserView>)adminViewRepository.getAllUsersMessages();
	}
	
	
	
	
	
	
	
}
