package com.careApi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.careApi.model.Question;
import com.careApi.model.User;
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

	@GetMapping("/getlistBySurveyId/{id}")
	public ResponseEntity<List<Question>> getAllQuestions(@PathVariable("id") String surveyId) {
		Question que = new Question();
		que.setSurvey(Long.valueOf(surveyId));
		List<Question> list = questionService.getAllQuestionsBySurveyID(que.getSurvey());
		return new ResponseEntity<List<Question>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	 @PostMapping("/createQuestion") 
	  public ResponseEntity<Question> add(@RequestBody Question question)
	  {		  
		 Question created= questionService.createQuestion(question);	
		  return new ResponseEntity<Question>(created, new HttpHeaders(), HttpStatus.OK);
	  }
	 
	 
		/*
		 * "userid": "123", "surveyID": "3454", "questions": ["What is the Issue?",
		 * "who is this?", "How are you"]
		 */

	 @PostMapping("/createbulkQuestion") 
	  public void addBulk(@RequestBody String question)
	  {		
		 
		try {
			
			JSONParser parser = new JSONParser();
			 JSONObject json = (JSONObject) parser.parse(question);
			 JSONArray jsonArray= (JSONArray) json.get("question");
			 Long user_id=(Long) json.get("user_id");
			 Long survey_id=(Long) json.get("survey");
					 
			  for(int i=0; i<jsonArray.size(); i++){
		            String ques=(String) jsonArray.get(i);
		            Question que=new Question();
		            que.setUser_id(user_id);
		            que.setSurvey(survey_id);
		            que.setQuestion(ques);
		            questionService.createQuestion(que);		
		        }
			  
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		 
				 
	  }
	 
	 
	 

}
