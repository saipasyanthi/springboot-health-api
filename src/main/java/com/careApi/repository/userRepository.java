package com.careApi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.careApi.model.User;


  @Repository
  public interface userRepository extends JpaRepository<User,Long> {

	  
  }
 

