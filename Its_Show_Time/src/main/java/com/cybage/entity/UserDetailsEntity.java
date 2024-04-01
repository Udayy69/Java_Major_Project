package com.cybage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String password;
	private String roles;

	public UserDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetailsEntity(int userId, String userName, String password, String roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "UserDetailsEntity [userId=" + userId + ", userName=" + userName + ", password=" + password + ", roles="
				+ roles + "]";
	}

}
