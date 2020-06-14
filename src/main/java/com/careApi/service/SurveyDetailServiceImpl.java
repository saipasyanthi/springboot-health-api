package com.careApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careApi.model.SurveyDetails;
import com.careApi.repository.SurveyDetailRepository;

@Service
public class SurveyDetailServiceImpl {
	
	@Autowired
	private SurveyDetailRepository surveyDetDao;
	
	 public SurveyDetails createSurveyDetails(SurveyDetails surveyDet) {
		  
			return surveyDetDao.save(surveyDet);			
		  
		  }

			/*
			 * public List<SurveyDetails> getAllSurvey() { List<SurveyDetails> suveryList =
			 * surveyDetDao.findAll();
			 * 
			 * if(suveryList.size() > 0) { return suveryList; } else { return new
			 * ArrayList<SurveyDetails>(); } }
			 */

	
			

}
