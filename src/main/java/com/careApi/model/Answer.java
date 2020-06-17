package com.careApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
	
	private Long id;
	private String answer;
    private String survey_id;    
    private String sur_det_id;    
    private Long user_id;
    private String status;
    private Long question_id;
    
    @Id
    @Column(name="answer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
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
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", survey_id=" + survey_id + ", sur_det_id=" + sur_det_id
				+ ", user_id=" + user_id + ", status=" + status + ", question_id=" + question_id + "]";
	}

}
