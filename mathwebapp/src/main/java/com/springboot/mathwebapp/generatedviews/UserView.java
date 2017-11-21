package com.springboot.mathwebapp.generatedviews;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import com.springboot.mathwebapp.generatedentities.UserGrades;
import com.springboot.mathwebapp.generatedentities.UserHomework;
import com.springboot.mathwebapp.generatedentities.UserLogs;
import com.springboot.mathwebapp.generatedentities.UserMessages;
import com.springboot.mathwebapp.generatedentities.UserRoles;


/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "mathapplicationschema")
@Immutable
public class UserView implements java.io.Serializable {

	private Integer userid;
	private UserRolesView userRoles;
	private String name;
	private String email;
	private String password;
	private String class_;
	private String phoneNumber;
	private String address;
	private Integer status;
	private Set<UserLogsView> userLogses = new HashSet<UserLogsView>(0);
	private Set<UserMessagesView> userMessageses = new HashSet<UserMessagesView>(0);
	private Set<UserGradesView> userGradeses = new HashSet<UserGradesView>(0);
	private Set<UserHomeworkView> userHomeworks = new HashSet<UserHomeworkView>(0);

	public UserView() {
	}

	public UserView(String email, String password, String class_) {
		this.email = email;
		this.password = password;
		this.class_ = class_;
	}

	public UserView(UserRolesView userRoles, String name, String email, String password, String class_, String phoneNumber,
			String address, Integer status, Set<UserLogsView> userLogses, Set<UserMessagesView> userMessageses,
			Set<UserGradesView> userGradeses, Set<UserHomeworkView> userHomeworks) {
		this.userRoles = userRoles;
		this.name = name;
		this.email = email;
		this.password = password;
		this.class_ = class_;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.status = status;
		this.userLogses = userLogses;
		this.userMessageses = userMessageses;
		this.userGradeses = userGradeses;
		this.userHomeworks = userHomeworks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "userid", unique = true, nullable = false)
	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role")
	public UserRolesView getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(UserRolesView userRoles) {
		this.userRoles = userRoles;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "class", nullable = false)
	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "phone_number", length = 10)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserLogsView> getUserLogses() {
		return this.userLogses;
	}

	public void setUserLogses(Set<UserLogsView> userLogses) {
		this.userLogses = userLogses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserMessagesView> getUserMessageses() {
		return this.userMessageses;
	}

	public void setUserMessageses(Set<UserMessagesView> userMessageses) {
		this.userMessageses = userMessageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserGradesView> getUserGradeses() {
		return this.userGradeses;
	}

	public void setUserGradeses(Set<UserGradesView> userGradeses) {
		this.userGradeses = userGradeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserHomeworkView> getUserHomeworks() {
		return this.userHomeworks;
	}

	public void setUserHomeworks(Set<UserHomeworkView> userHomeworks) {
		this.userHomeworks = userHomeworks;
	}

}
