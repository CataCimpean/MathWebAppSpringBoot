package com.springboot.mathwebapp.generatedviews;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

import com.springboot.mathwebapp.generatedentities.UserHomework;

/**
 * UserUploadfiles generated by hbm2java
 */
@Entity
@Table(name = "user_uploadfiles", catalog = "mathapplicationschema")
@Immutable
public class UserUploadFilesView implements java.io.Serializable {

	private Integer uploadfilesid;
	private UserHomeworkView userHomework;
	private Date loadedDate;
	private byte[] content;
	private Integer forUserid;

	public UserUploadFilesView() {
	}

	public UserUploadFilesView(UserHomeworkView userHomework, Date loadedDate, byte[] content, Integer forUserid) {
		this.userHomework = userHomework;
		this.loadedDate = loadedDate;
		this.content = content;
		this.forUserid = forUserid;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "uploadfilesid", unique = true, nullable = false)
	public Integer getUploadfilesid() {
		return this.uploadfilesid;
	}

	public void setUploadfilesid(Integer uploadfilesid) {
		this.uploadfilesid = uploadfilesid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "userid", referencedColumnName = "homeworkid"),
			@JoinColumn(name = "homeworkid", referencedColumnName = "userid") })
	public UserHomeworkView getUserHomework() {
		return this.userHomework;
	}

	public void setUserHomework(UserHomeworkView userHomework) {
		this.userHomework = userHomework;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "loaded_date", length = 10)
	public Date getLoadedDate() {
		return this.loadedDate;
	}

	public void setLoadedDate(Date loadedDate) {
		this.loadedDate = loadedDate;
	}

	@Column(name = "content")
	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	@Column(name = "for_userid")
	public Integer getForUserid() {
		return this.forUserid;
	}

	public void setForUserid(Integer forUserid) {
		this.forUserid = forUserid;
	}

}
