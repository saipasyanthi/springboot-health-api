package com.careApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careApi.model.Survey;
import com.careApi.repository.SurveyRepository;

@Service
public class SurveyServiceImpl {
	@Autowired
	private SurveyRepository surveyDao;
	
	 public Survey createSurvey(Survey survey) {
		  
			return surveyDao.save(survey);			
		  
		  }

	public List<Survey> getAllSurvey() {
		List<Survey> suveryList = surveyDao.findAll();
        
        if(suveryList.size() > 0) {
            return suveryList;
        } else {
            return new ArrayList<Survey>();
        } 
	}
		
}
