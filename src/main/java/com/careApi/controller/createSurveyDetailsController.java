package com.careApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careApi.model.SurveyDetails;
import com.careApi.service.SurveyDetailServiceImpl;

@RestController
@RequestMapping("/surveyDetails")
@Validated
@CrossOrigin
public class createSurveyDetailsController {
	
	@Autowired
    private SurveyDetailServiceImpl surveyDetService;
	
	 @PostMapping("/createSurveyDetails") 
	  public ResponseEntity<SurveyDetails>  add(@RequestBody SurveyDetails surveyDet)
	  {		  
		 SurveyDetails created= surveyDetService.createSurveyDetails(surveyDet);
		 return new ResponseEntity<SurveyDetails>(created, new HttpHeaders(), HttpStatus.OK);
	  }
}
