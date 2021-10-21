package com.exam.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_profile")
@SuppressWarnings("serial")
public class UserProfileBean implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(unique = true, nullable = false)
	private String mobile;
	
	private String plan;
	private int status;
	private Date registrationDate;
	private Date ExpairyDate;	
	
	@OneToOne(mappedBy = "userprofilebean") 
    private UserBean userBean;

	@Override
	public String toString() {
		return "UserProfileBean [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", plan="
				+ plan + ", status=" + status + ", registrationDate=" + registrationDate + ", ExpairyDate="
				+ ExpairyDate + ", userBean=" + userBean + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getExpairyDate() {
		return ExpairyDate;
	}

	public void setExpairyDate(Date expairyDate) {
		ExpairyDate = expairyDate;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}	
	 
}
