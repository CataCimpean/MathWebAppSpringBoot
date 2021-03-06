package com.springboot.mathwebapp.generatedentities;
// Generated Nov 21, 2017 6:39:25 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "mathapplicationschema")
public class User implements java.io.Serializable {

	private Integer userid;
	private UserRoles userRoles;
	private String name;
	private String email;
	private String password;
	private String class_;
	private String phoneNumber;
	private String address;
	private Integer status;
	private Set<UserLogs> userLogses = new HashSet<UserLogs>(0);
	private Set<UserMessages> userMessageses = new HashSet<UserMessages>(0);
	private Set<UserGrades> userGradeses = new HashSet<UserGrades>(0);
	private Set<UserHomework> userHomeworks = new HashSet<UserHomework>(0);

	public User() {
	}

	public User(String email, String password, String class_) {
		this.email = email;
		this.password = password;
		this.class_ = class_;
	}

	public User(UserRoles userRoles, String name, String email, String password, String class_, String phoneNumber,
			String address, Integer status, Set<UserLogs> userLogses, Set<UserMessages> userMessageses,
			Set<UserGrades> userGradeses, Set<UserHomework> userHomeworks) {
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
	public UserRoles getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(UserRoles userRoles) {
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
	public Set<UserLogs> getUserLogses() {
		return this.userLogses;
	}

	public void setUserLogses(Set<UserLogs> userLogses) {
		this.userLogses = userLogses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserMessages> getUserMessageses() {
		return this.userMessageses;
	}

	public void setUserMessageses(Set<UserMessages> userMessageses) {
		this.userMessageses = userMessageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserGrades> getUserGradeses() {
		return this.userGradeses;
	}

	public void setUserGradeses(Set<UserGrades> userGradeses) {
		this.userGradeses = userGradeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserHomework> getUserHomeworks() {
		return this.userHomeworks;
	}

	public void setUserHomeworks(Set<UserHomework> userHomeworks) {
		this.userHomeworks = userHomeworks;
	}

}
