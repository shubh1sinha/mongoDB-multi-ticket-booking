package com.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.RegistrationDTO;
import com.spring.entity.Login;
import com.spring.entity.Registration;
import com.spring.repo.LoginRepository;
import com.spring.repo.RegistrationRepository;

/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Service
public class UserService implements UserServiceDAO {

	@Autowired
	private RegistrationRepository registrationRepo;

	@Autowired
	private LoginRepository loginRepo;

	/****
	 * @method user registration
	 * @param user
	 * @return string
	 */
	@Override
	public String registerUser(RegistrationDTO user) {
		if (registrationRepo.existsById(user.getMobile())) {
			return "User with " + user.getMobile() + " Already Exists";
		} else {
			Registration userReg = new Registration();
			userReg.setPassword(user.getPassword());
			userReg.setEmial(user.getEmail());
			userReg.setFirstName(user.getlastName());
			userReg.setMobile(user.getMobile());
			userReg.setlastName(user.getlastName());
			userReg.setCountry(user.getCountry());
			userReg.setDistrict(user.getDistrict());
			userReg.setState(user.getState());
			registrationRepo.save(userReg);
			Login login = new Login();
			login.setUsername(user.getMobile());
			login.setPassword(user.getPassword());
			loginRepo.save(login);
			return "User with username " + user.getMobile() + " Added Successfully";
		}
	}

	/***
	 * @method user login
	 * @param username
	 * @param password
	 * @return boolean
	 */
	@Override
	public boolean userLogin(String username, String password) {
		Optional<Login> user = loginRepo.findById(username);
		if (user.isPresent()) {
			if (user.get().getUsername().equals(username) && user.get().getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	/***
	 * @method return user by username
	 */
	@Override
	public Optional<Registration> findUserById(String username) {
		return registrationRepo.findById(username);

	}
}
