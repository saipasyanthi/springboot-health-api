package com.careApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
	private Long id;
	private String question;
    private String survey_id;    
    private String sur_det_id;    
    private String user_id;
    private String status;
    
    @Id
    @Column(name="question_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(String survey_id) {
		this.survey_id = survey_id;
	}
	public String getSur_det_id() {
		return sur_det_id;
	}
	public void setSur_det_id(String sur_det_id) {
		this.sur_det_id = sur_det_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id2) {
		this.user_id = user_id2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", survey_id=" + survey_id + ", sur_det_id="
				+ sur_det_id + ", user_id=" + user_id + ", status=" + status + "]";
	}
	
	
}
