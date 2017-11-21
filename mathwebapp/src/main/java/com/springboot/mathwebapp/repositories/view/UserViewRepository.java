package com.springboot.mathwebapp.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import com.springboot.mathwebapp.generatedviews.UserView;

@RepositoryDefinition(domainClass=UserView.class, idClass=Integer.class)
public interface UserViewRepository {

	

	@Query(value = "FROM UserView q1  WHERE  q1.id=:idUser")
    List<UserView> getAllDetailsAboutOneUser(@Param("idUser") Integer idUser);
	
	@Query(value = "SELECT CASE WHEN COUNT(q1.id) > 0 THEN true else false end FROM UserView q1 WHERE q1.id=:idUser")
	Boolean searchByIdIfOneUserExist(@Param("idUser") Integer idUser);
	
	@Query(value = "SELECT q1.name, q2.grade,q2.evaluationDate,q2.observations, q2.examName FROM UserView q1 LEFT JOIN UserGradesView q2 ON q1.id = q2.user WHERE q1.id=:idUser")
    List<UserView> getGradesForOneUser(@Param("idUser") Integer idUser);
	
	
	@Query(value = "SELECT q1.name AS UserName, q2.loginDate AS Log_Date FROM UserView q1 RIGHT JOIN UserLogsView q2 ON q1.id = q2.user WHERE q1.id=:idUser")
	//@Query(value =  "SELECT userLog FROM UserView q1 WHERE q1.id=:idUser")
	List<UserView> getLogDetailsAboutOneUser(@Param("idUser") Integer idUser);
	
	@Query(value = "SELECT q1.name AS Loaded_By, q2.name AS Homework_Name,q3.loadedDate AS Loaded_Date, q2.deadline AS DeadLine, q3.content AS Content FROM UserView q1 RIGHT JOIN UserHomeworkView q2 ON q1.id = q2.user RIGHT JOIN UserUploadFilesView q3 ON q2.id = q3.userHomework WHERE q2.forUserid =:idUser")
	List<UserView> getAllHomeworkForCurrentUser(@Param("idUser") Integer idUser);
	
	
	@Query(value="SELECT q1.name AS MessageFrom, q2.message AS Message, q2.messageDate AS MessageSendDate FROM UserView q1 RIGHT JOIN  UserMessagesView q2 ON q1.id = q2.user WHERE q2.forUserid =:idUser")
	List<UserView> getAllInputMessagessForCurrentUser(@Param("idUser") Integer idUser);
	
	
	@Query(value="SELECT q1.name AS MessageFrom, q2.message AS Message, q2.messageDate AS MessageSendDate FROM UserView q1 RIGHT JOIN  UserMessagesView q2 ON q1.id = q2.user WHERE q1.id =:idUser")
	List<UserView> getAllOutputMessagessFromCurrentUser(@Param("idUser") Integer idUser);
	
	
}
