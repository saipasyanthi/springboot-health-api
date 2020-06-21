package com.careApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careApi.model.Question;
import com.careApi.repository.QuestionRepository;

@Service
public class QuestionServiceImpl {
	
	@Autowired
	private QuestionRepository questionDao;
	
	 public Question createQuestion(Question question) {
		  
			return questionDao.save(question);			
		  
		  }

	 
	public List<Question> getAllQuestions() {
		List<Question> questionList = questionDao.findAll();
        
        if(questionList.size() > 0) {
            return questionList;
        } else {
            return new ArrayList<Question>();
        } 
	}

	public List<Question> getAllQuestionsBySurveyID(Long surveyId) {
		List<Question> questionList = questionDao.findAllBySurvey(surveyId);
		if(questionList.size() > 0) {
			return questionList;
		} else {
			return new ArrayList<Question>();
		}
	}
}
