package com.spring.entity;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
public class Registration {

	private String mobile;

	private String email;

	private String firstName;

	private String lastName;

	private String country;

	private String state;

	private String district;
	
	private String password;

	public Registration() {
	}

	public Registration(String mobile, String email, String firstName, String lastName, String country, String state,
			String district, String password) {
		this.mobile = mobile;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.state = state;
		this.district = district;
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmial(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
