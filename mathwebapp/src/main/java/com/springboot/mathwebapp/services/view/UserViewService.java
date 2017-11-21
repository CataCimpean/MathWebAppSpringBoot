package com.springboot.mathwebapp.services.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mathwebapp.generatedviews.UserView;
import com.springboot.mathwebapp.repositories.view.UserViewRepository;

@Service
public class UserViewService {

	
	
	
	@Autowired
	UserViewRepository userViewRepository;

	public UserViewService(UserViewRepository userViewRepository){
		this.userViewRepository = userViewRepository;
	}
	
	
	
	public List<UserView> getAllDetailsAboutOneUser(){
		return (List<UserView>) userViewRepository.getAllDetailsAboutOneUser((Integer) 2);
	}
	
	public  List<UserView> getGradesForOneUser(){
		return(List<UserView>) userViewRepository.getGradesForOneUser((Integer) 2);
	}
	
	
	public  List<UserView> getLogDetailsAboutOneUser() {
		return  (List<UserView>) userViewRepository.getLogDetailsAboutOneUser((Integer) 2);
	}
	
	
	public List<UserView> getAllHomeworkForCurrentUser(){
		return (List<UserView>) userViewRepository.getAllHomeworkForCurrentUser((Integer) 2);
	}
	
	
	
	public List<UserView> getAllInputMessagessForCurrentUser(){
		return (List<UserView>) userViewRepository.getAllInputMessagessForCurrentUser((Integer) 2);
	}

	public List<UserView> getAllOutputMessagessFromCurrentUser(){
		return (List<UserView>) userViewRepository.getAllOutputMessagessFromCurrentUser((Integer) 2);
	}
	
	
	public Boolean searchByIdIfOneUserExist(){
		Boolean exist = false;
		if(userViewRepository.searchByIdIfOneUserExist((Integer) 2) == true){
			exist = true;
		}else{
			return exist;
		}
		return exist;
	}
	
	
}
