package com.careApi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careApi.exception.RecordNotFoundException;
import com.careApi.model.User;
//import com.careApi.repository.userRepository;
import com.careApi.service.UserDetailServiceImpl;


@RestController
@RequestMapping("/health")
@Validated
@CrossOrigin
public class userController {

	@Autowired
    private UserDetailServiceImpl userService;
	
		 
	    @GetMapping("/getlist") 
	    public ResponseEntity<List<User>> getAllUser() {
	        List<User> list = userService.getAllusers();
	 
	        return new ResponseEntity<List<User>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	    
	    @PostMapping("/login")
	    public ResponseEntity<User> loginUser(@RequestBody User user)
	                                                    throws RecordNotFoundException {
	    	User login =userService.loginUser(user);
	        return new ResponseEntity<User>(login, new HttpHeaders(), HttpStatus.OK);
	    }
	 
	    @GetMapping("/getlist/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) 
	                                                    throws RecordNotFoundException {
	    	User entity = userService.getUserById(id);
	 
	        return new ResponseEntity<User>(entity, new HttpHeaders(), HttpStatus.OK);
	    }
	 
	    @PostMapping("/updateUser")
	    public ResponseEntity<User> UpdateUser(@RequestBody User user)
	                                                    throws RecordNotFoundException {
	    	User updated =userService.updateUser(user);
	        return new ResponseEntity<User>(updated, new HttpHeaders(), HttpStatus.OK);
	    }
	    
	    @PostMapping("/createUser") 
		  public ResponseEntity<User> add(@RequestBody User user)
		  {		  
	    	User created =userService.createUser(user);			 
			   return new ResponseEntity<User>(created, new HttpHeaders(), HttpStatus.OK);
		  }
	 
	    @DeleteMapping("/delete/{id}")
	    public HttpStatus deleteUserById(@PathVariable("id") Long id) 
	                                                    throws RecordNotFoundException {
	    	userService.deleteUserById(id);
	        return HttpStatus.FORBIDDEN;
	    }

}
