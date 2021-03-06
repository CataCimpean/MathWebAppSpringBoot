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
 * UserMessages generated by hbm2java
 */
@Entity
@Table(name = "user_messages", catalog = "mathapplicationschema")
@Immutable
public class UserMessagesView implements java.io.Serializable {

	private Integer messageid;
	private UserView user;
	private String message;
	private Integer forUserid;
	private Date messageDate;

	public UserMessagesView() {
	}

	public UserMessagesView(UserView user, String message, Integer forUserid, Date messageDate) {
		this.user = user;
		this.message = message;
		this.forUserid = forUserid;
		this.messageDate = messageDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "messageid", unique = true, nullable = false)
	public Integer getMessageid() {
		return this.messageid;
	}

	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public UserView getUser() {
		return this.user;
	}

	public void setUser(UserView user) {
		this.user = user;
	}

	@Column(name = "message", length = 1024)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "for_userid")
	public Integer getForUserid() {
		return this.forUserid;
	}

	public void setForUserid(Integer forUserid) {
		this.forUserid = forUserid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "messageDate", length = 10)
	public Date getMessageDate() {
		return this.messageDate;
	}

	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

}
