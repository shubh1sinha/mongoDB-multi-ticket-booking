package com.spring.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Document(collection = "login")
public class Login {
	
	@Id
	private String username;
	
	private String password;

	
	public Login() {
	}


	public Login(String username, String password) {
		this.username = username;
		this.password = password;
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
	
	
	

}
