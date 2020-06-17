package com.careApi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.careApi.exception.RecordNotFoundException;
import com.careApi.model.User;
import com.careApi.repository.userRepository;

@Service
public class UserDetailServiceImpl {
	
	@Autowired
	private userRepository userDao;
	
	  public List<User> getAllusers() { 
		  List<User> userList = userDao.findAll();
	         
	        if(userList.size() > 0) {
	            return userList;
	        } else {
	            return new ArrayList<User>();
	        } 
		  }
	  
	  public User getUserById(Long id) throws RecordNotFoundException 
	    {
	        Optional<User> user = userDao.findById(id);
	         
	        if(user.isPresent()) {
	            return user.get();
	        } else {
	            throw new RecordNotFoundException("No user record exist for given id");
	        }
	    }
	     
	  public User updateUser(User user) throws RecordNotFoundException 
	    {
	        Optional<User> user123 = userDao.findById(user.getUser_id());
	         
	        if(user123.isPresent()) 
	        {
	            User newEntity = user123.get();
	            newEntity.setEmail(user.getEmail());
	            newEntity.setUsername(user.getUsername());
	         //   newEntity.setLastName(entity.getLastName());
	 
	            newEntity = userDao.save(newEntity);
	             
	            return newEntity;
	        } else {
	        	user = userDao.save(user);
	             
	            return user;
	        }
	    } 
	  
	  public User createUser(User user) {
		  
		return userDao.save(user);			
	  
	  }
		
	  
	  public void deleteUserById(Long id) throws RecordNotFoundException 
	    {
	        Optional<User> user = userDao.findById(id);
	         
	        if(user.isPresent()) 
	        {
	        	userDao.deleteById(id);
	        } else {
	            throw new RecordNotFoundException("No user record exist for given id");
	        }
	    }

	public User loginUser(User user) {
		
		String username=user.getUsername();
		String password=user.getPassword();
		return	userDao.findByUsernameAndPassword(username,password);
		
	} 

}


