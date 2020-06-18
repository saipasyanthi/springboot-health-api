package com.careApi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
			 System.out.println(json.get("user_id"));			 
			 System.out.println(json.get("survey_id"));
			 JSONArray jsonArray= (JSONArray) json.get("question");
			 
			 String user_id=(String) json.get("user_id");
			 String survey_id=(String) json.get("survey_id");
			
			 
			  for(int i=0; i<jsonArray.size(); i++){
		            System.out.println(jsonArray.get(i));
		            String ques=(String) jsonArray.get(i);
		            Question que=new Question();
		            que.setUser_id(user_id);
		            que.setSurvey_id(survey_id);
		            que.setQuestion(ques);
		            questionService.createQuestion(que);		
		        }
			  
			  
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		 
				 
	  }
	 
	 
	 

}
