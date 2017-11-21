package com.springboot.mathwebapp.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import com.springboot.mathwebapp.generatedviews.UserView;

@RepositoryDefinition(domainClass=UserView.class, idClass=Integer.class)
public interface AdminViewRepository {


	@Query(value = "FROM UserView ")
	List<UserView> getTheWholeDb();
	

	@Query("SELECT q1.name as UserName, q1.email as UserEmail, q1.class_ as UserClass, q1.phoneNumber as PhoneNumber, q1.address as Address,  q1.status as Status FROM UserView q1 WHERE q1.id =:idUser")
	List<UserView> getOneUserDetails(@Param("idUser") Integer idUser);
	
	
	@Query(value = "SELECT q1.name AS UserName,q2.grade as Grade, q2.evaluationDate AS EvaluationDate, q2.examName AS ExamName,  q2.observations AS Observations FROM UserView q1 RIGHT JOIN UserGradesView q2 ON q1.id = q2.user WHERE q1.id =:idUser")
	List<UserView> getOneUserGrades(@Param("idUser") Integer idUser);
	
	

	@Query(value = "SELECT q1.name AS UserName,q2.grade as Grade, q2.evaluationDate AS EvaluationDate, q2.examName AS ExamName,  q2.observations AS Observation FROM UserView q1 RIGHT JOIN UserGradesView q2 ON q1.id = q2.user")
	List<UserView> getAllUsersGrades();
	
	

	@Query(value ="SELECT q1.name AS UserName,q2.message AS UserMessage,q2.messageDate as MessageDate FROM UserView q1 RIGHT JOIN UserMessagesView q2 ON q1.id  = q2.user RIGHT JOIN UserRolesView q3 ON q1.id = q3.id WHERE q3.role <> 'ADMIN' AND q1.id =:idUser ")
	List<UserView> getOneUserMessage(@Param("idUser") Integer idUser);
	
	

	@Query(value ="SELECT q1.name AS UserName,q2.message AS UserMessage,q2.messageDate as MessageDate FROM UserView q1 RIGHT JOIN UserMessagesView q2 ON q1.id  = q2.user RIGHT JOIN UserRolesView q3 ON q1.userRoles = q3.id WHERE q3.role <> 'ADMIN' ")
	List<UserView> getAllUsersMessages();
	
	   
}
