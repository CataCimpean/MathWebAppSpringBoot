package com.springboot.mathwebapp.generatedentities;
// Generated Nov 21, 2017 6:39:25 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserGrades generated by hbm2java
 */
@Entity
@Table(name = "user_grades", catalog = "mathapplicationschema")
public class UserGrades implements java.io.Serializable {

	private Integer gradeid;
	private User user;
	private Float grade;
	private Date evaluationDate;
	private String observations;
	private String examName;

	public UserGrades() {
	}

	public UserGrades(User user, Float grade, Date evaluationDate, String observations, String examName) {
		this.user = user;
		this.grade = grade;
		this.evaluationDate = evaluationDate;
		this.observations = observations;
		this.examName = examName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "gradeid", unique = true, nullable = false)
	public Integer getGradeid() {
		return this.gradeid;
	}

	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "grade", precision = 4)
	public Float getGrade() {
		return this.grade;
	}

	public void setGrade(Float grade) {
		this.grade = grade;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "evaluation_date", length = 10)
	public Date getEvaluationDate() {
		return this.evaluationDate;
	}

	public void setEvaluationDate(Date evaluationDate) {
		this.evaluationDate = evaluationDate;
	}

	@Column(name = "observations", length = 1024)
	public String getObservations() {
		return this.observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	@Column(name = "exam_name", length = 128)
	public String getExamName() {
		return this.examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

}
