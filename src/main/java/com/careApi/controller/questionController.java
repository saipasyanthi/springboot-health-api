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

import com.careApi.model.Question;
import com.careApi.service.QuestionServiceImpl;

@RestController
@RequestMapping("/question")
@Validated
@CrossOrigin
public class questionController {
	
	@Autowired
    private QuestionServiceImpl questionService;

	 @GetMapping("/getlist") 
	    public ResponseEntity<List<Question>> getAllQuestions() {
	        List<Question> list = questionService.getAllQuestions();
	 
	        return new ResponseEntity<List<Question>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	 @PostMapping("/createQuestion") 
	  public void add(@RequestBody Question question)
	  {		  
		 questionService.createQuestion(question);			   
	  }

}
