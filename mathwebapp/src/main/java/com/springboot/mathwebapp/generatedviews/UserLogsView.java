package com.springboot.mathwebapp.generatedviews;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

import com.springboot.mathwebapp.generatedentities.User;


/**
 * UserLogs generated by hbm2java
 */
@Entity
@Table(name = "user_logs", catalog = "mathapplicationschema")
@Immutable
public class UserLogsView implements java.io.Serializable {

	private Integer logid;
	private UserView user;
	private Date loginDate;

	public UserLogsView() {
	}

	public UserLogsView(UserView user, Date loginDate) {
		this.user = user;
		this.loginDate = loginDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "logid", unique = true, nullable = false)
	public Integer getLogid() {
		return this.logid;
	}

	public void setLogid(Integer logid) {
		this.logid = logid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public UserView getUser() {
		return this.user;
	}

	public void setUser(UserView user) {
		this.user = user;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "login_date", length = 10)
	public Date getLoginDate() {
		return this.loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

}
