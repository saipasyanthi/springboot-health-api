package com.careApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careApi.model.Answer;
import com.careApi.repository.AnswerRepository;

@Service
public class AnswerServiceImpl {
	
	@Autowired
	private AnswerRepository answerDao;
	
	 public Answer createAnswer(Answer answer) {
		  
			return answerDao.save(answer);			
		  
		  }

	public List<Answer> getAllAnswers() {
		List<Answer> answerList = answerDao.findAll();
        
        if(answerList.size() > 0) {
            return answerList;
        } else {
            return new ArrayList<Answer>();
        } 
	}
}
