package com.spring.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.RegistrationDTO;
import com.spring.entity.Registration;
import com.spring.service.UserServiceDAO;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@RestController
public class UserRestController {

	@Autowired
	private UserServiceDAO userService;
	
	/***
	 * @method Register user
	 * @param user
	 * @return response
	 */
	@PostMapping(value="user/add" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> registerUser(@RequestBody RegistrationDTO user){
		String result = userService.registerUser(user);
		return ResponseEntity.ok("{\"status\":\""+result+"\"}");
		
	}
	
	/***
	 * 
	 * @param username
	 * @param password
	 * @return Login User
	 */
	@GetMapping(value="user/{username}/{password}" , produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> userLogin(@PathVariable("username") String username, @PathVariable("password") String password){
		boolean result = userService.userLogin(username, password);
		if(result == true) {
			return ResponseEntity.ok("{\"status\":\"User Logged In Successfully!\"}");
		}
		else {
			return ResponseEntity.status(404).body("{\"status\":\"Unauthorized Access!\"}");
		}
		
	}
	/***
	 * 
	 * @param username
	 * @return registration details 
	 * 		according to userId
	 */
	@GetMapping(value="user/find/{username}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getUserById(@PathVariable("username") String username){
		Optional<Registration> user =  userService.findUserById(username);
		if(user.isPresent()) {
			return ResponseEntity.ok(user);
		}
		else {
			return ResponseEntity.status(404).body("{\"status\":\"User Not present!\"}");
		}
	}
}
