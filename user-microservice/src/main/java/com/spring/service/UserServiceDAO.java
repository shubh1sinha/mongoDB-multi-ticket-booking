package com.spring.service;

import java.util.Optional;

import com.spring.dto.RegistrationDTO;
import com.spring.entity.Registration;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
public interface UserServiceDAO {
	
	public String registerUser(RegistrationDTO user);
	
	public boolean userLogin(String username, String password);
	
	public Optional<Registration> findUserById(String username);

}
