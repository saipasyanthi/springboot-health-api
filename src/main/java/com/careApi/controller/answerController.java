package com.careApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careApi.model.Answer;
import com.careApi.service.AnswerServiceImpl;

@RestController
@RequestMapping("/answer")
@Validated
@CrossOrigin
public class answerController {

	@Autowired
    private AnswerServiceImpl answerService;

	 @GetMapping("/getlist") 
	    public ResponseEntity<List<Answer>> getAllAnswers() {
	        List<Answer> list = answerService.getAllAnswers();
	        
	        return new ResponseEntity<List<Answer>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	 @PostMapping("/createAnswer") 
	  public void add(@RequestBody Answer answer)
	  {		  
		 answerService.createAnswer(answer);			   
	  }
}
