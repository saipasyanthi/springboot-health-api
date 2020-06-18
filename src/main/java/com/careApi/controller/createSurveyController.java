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

import com.careApi.model.Survey;
import com.careApi.service.SurveyServiceImpl;

@RestController
@RequestMapping("/survey")
@Validated
@CrossOrigin
public class createSurveyController {
	
	@Autowired
    private SurveyServiceImpl surveyService;

	 @GetMapping("/getlist") 
	    public ResponseEntity<List<Survey>> getAllSurvey() {
	        List<Survey> list = surveyService.getAllSurvey();
	 
	        return new ResponseEntity<List<Survey>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	 @PostMapping("/createSurvey") 
	  public ResponseEntity<Survey>  add(@RequestBody Survey survey)
	  {		  
		 Survey created= surveyService.createSurvey(survey);		
		 return new ResponseEntity<Survey>(created, new HttpHeaders(), HttpStatus.OK);
	  }

}
