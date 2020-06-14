package com.careApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	  public void add(@RequestBody SurveyDetails surveyDet)
	  {		  
		 surveyDetService.createSurveyDetails(surveyDet);			   
	  }
}
