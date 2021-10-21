package com.exam.app.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.exam.app.commons.RoleEnum;

@Entity
@Table(name = "users")
@SuppressWarnings("serial")
public class UserBean implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique = true, nullable = false, name = "username")
	private String username;
	@Column(name = "password", nullable = false)
	String password;

	@Column(name = "role", nullable = false)
	@Enumerated(EnumType.STRING)
	RoleEnum role;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "usr_profile", joinColumns = {
			@JoinColumn(name = "user_profile_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "user_id", referencedColumnName = "id") })
	private UserProfileBean userprofilebean;

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", userprofilebean=" + userprofilebean + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum role) {
		this.role = role;
	}

	public UserProfileBean getUserprofilebean() {
		return userprofilebean;
	}

	public void setUserprofilebean(UserProfileBean userprofilebean) {
		this.userprofilebean = userprofilebean;
	}

}
