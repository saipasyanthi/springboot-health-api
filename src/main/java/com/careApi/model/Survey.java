package com.careApi.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "surveys")
public class Survey {
	
	private Long id;
	private String title;
    private String description;    
    private Long user_id;
    private String status;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="survey_id")
    private Set<SurveyDetails> surveyDet;
    
    @ManyToOne
    private User user;
    
    @Id
    @Column(name="survey_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @OneToMany(mappedBy="surveys")
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="survey_name")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name="survey_desc")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="user_id")
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	@Column(name="survey_status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public Survey() {
    }
 
	public Survey(Long id, String title, String description,Long user_id,String status ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user_id=user_id;
        this.status=status;
       
    }

}
