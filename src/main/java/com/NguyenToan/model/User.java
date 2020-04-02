package com.NguyenToan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="idUser")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int  idUser;
	
	@Column(name="UserName")
	String Username;
	
	@Column(name="Password")
	String Password;
	public User() {
		super();
	}

	public User(int idUser, String username, String password) {
		super();
		this.idUser = idUser;
		Username = username;
		Password = password;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

		
}
