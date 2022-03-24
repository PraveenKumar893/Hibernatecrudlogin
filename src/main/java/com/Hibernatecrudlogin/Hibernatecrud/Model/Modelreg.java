package com.Hibernatecrudlogin.Hibernatecrud.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;





@Entity
@Table(name = "Admin_info")
public class Modelreg implements Serializable
{
	
	private static final long serialVersionUID = 4300712855765136555L;

	@Column(name = "NAME_FIELD")
	private String namefield;
	
	@Column(name = "USER_NAME")
	private String username;
	
	@Column(name = "PASSWORD_FIELD")
	private String password;

	public String getNamefield() {
		return namefield;
	}

	public void setNamefield(String namefield) {
		this.namefield = namefield;
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

	public Modelreg(String namefield, String username, String password) {
		super();
		this.namefield = namefield;
		this.username = username;
		this.password = password;
	}

	public Modelreg() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Modelreg [namefield=" + namefield + ", username=" + username + ", password=" + password + "]";
	}

	
}
