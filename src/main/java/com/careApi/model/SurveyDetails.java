package com.careApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name = "survey_details")
public class SurveyDetails {
	
	private Long sur_det_id ;
	private Long survey_id ;
	private Long user_id;
	private String health_num;
	private int age;
	private int weight;
	private int height;
	private String comunity;
	private String village;
	private String video;
	private String name;
	private String town;
	private String obesity;
	private String pain_start;
	private String pain_exactly;
	private String better;
	private String worse;
	private String radiate_site;
	private String pain_similar;
	private String pain_bad;
	private String pain_kind;
	private String bleeding;
	private String baby_moving;
	private String discharge;
	private String symptoms;
	private String urinary;
	private String renal_stone;
	private String symptoms_text;
	private String urinary_symptoms_text;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String answer5;
	private String answer6;
	private String answer7;
	private String uans1;
	private String uans2;
	private String uans3;
	private String uans4;
	private String uans5;
	private String uans6;
	private String uans7;
	private String dateofcreation;
	private String updatedDate;
	private String breathing_part;
	private String blood_clot;
	private String breathing_pain;
	private String lung_prob;
	private String expected_issue;
	private String mention_incident;
	private String possible_disease;
	
	
	@ManyToOne
    private User user;
	
	@ManyToOne
    private Survey survey;
	
	@Id
	@Column(name="sur_det_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getSur_det_id() {
		return sur_det_id;
	}
	public void setSur_det_id(Long sur_det_id) {
		this.sur_det_id = sur_det_id;
	}
	
	//@ManyToOne
   // @JoinColumn(name="survey_id", nullable=false)
	public Long getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(Long survey_id) {
		this.survey_id = survey_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	@Column(name="health_num")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
	@SequenceGenerator(name="book_generator", sequenceName = "HES_seq", allocationSize=50)
    public String getHealth_num() {
		return health_num;
	}
	public void setHealth_num(String health_num) {
		this.health_num = health_num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getComunity() {
		return comunity;
	}
	public void setComunity(String comunity) {
		this.comunity = comunity;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getObesity() {
		return obesity;
	}
	public void setObesity(String obesity) {
		this.obesity = obesity;
	}
	public String getPain_start() {
		return pain_start;
	}
	public void setPain_start(String pain_start) {
		this.pain_start = pain_start;
	}
	public String getPain_exactly() {
		return pain_exactly;
	}
	public void setPain_exactly(String pain_exactly) {
		this.pain_exactly = pain_exactly;
	}
	public String getBetter() {
		return better;
	}
	public void setBetter(String better) {
		this.better = better;
	}
	public String getWorse() {
		return worse;
	}
	public void setWorse(String worse) {
		this.worse = worse;
	}
	public String getRadiate_site() {
		return radiate_site;
	}
	public void setRadiate_site(String radiate_site) {
		this.radiate_site = radiate_site;
	}
	public String getPain_similar() {
		return pain_similar;
	}
	public void setPain_similar(String pain_similar) {
		this.pain_similar = pain_similar;
	}
	public String getPain_bad() {
		return pain_bad;
	}
	public void setPain_bad(String pain_bad) {
		this.pain_bad = pain_bad;
	}
	public String getPain_kind() {
		return pain_kind;
	}
	public void setPain_kind(String pain_kind) {
		this.pain_kind = pain_kind;
	}
	public String getBleeding() {
		return bleeding;
	}
	public void setBleeding(String bleeding) {
		this.bleeding = bleeding;
	}
	public String getBaby_moving() {
		return baby_moving;
	}
	public void setBaby_moving(String baby_moving) {
		this.baby_moving = baby_moving;
	}
	public String getDischarge() {
		return discharge;
	}
	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getUrinary() {
		return urinary;
	}
	public void setUrinary(String urinary) {
		this.urinary = urinary;
	}
	public String getRenal_stone() {
		return renal_stone;
	}
	public void setRenal_stone(String renal_stone) {
		this.renal_stone = renal_stone;
	}
	public String getSymptoms_text() {
		return symptoms_text;
	}
	public void setSymptoms_text(String symptoms_text) {
		this.symptoms_text = symptoms_text;
	}
	public String getUrinary_symptoms_text() {
		return urinary_symptoms_text;
	}
	public void setUrinary_symptoms_text(String urinary_symptoms_text) {
		this.urinary_symptoms_text = urinary_symptoms_text;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	public String getAnswer5() {
		return answer5;
	}
	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}
	public String getAnswer6() {
		return answer6;
	}
	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}
	public String getAnswer7() {
		return answer7;
	}
	public void setAnswer7(String answer7) {
		this.answer7 = answer7;
	}
	public String getUans1() {
		return uans1;
	}
	public void setUans1(String uans1) {
		this.uans1 = uans1;
	}
	public String getUans2() {
		return uans2;
	}
	public void setUans2(String uans2) {
		this.uans2 = uans2;
	}
	public String getUans3() {
		return uans3;
	}
	public void setUans3(String uans3) {
		this.uans3 = uans3;
	}
	public String getUans4() {
		return uans4;
	}
	public void setUans4(String uans4) {
		this.uans4 = uans4;
	}
	public String getUans5() {
		return uans5;
	}
	public void setUans5(String uans5) {
		this.uans5 = uans5;
	}
	public String getUans6() {
		return uans6;
	}
	public void setUans6(String uans6) {
		this.uans6 = uans6;
	}
	public String getUans7() {
		return uans7;
	}
	public void setUans7(String uans7) {
		this.uans7 = uans7;
	}
	public String getDateofcreation() {
		return dateofcreation;
	}
	public void setDateofcreation(String dateofcreation) {
		this.dateofcreation = dateofcreation;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getBreathing_part() {
		return breathing_part;
	}
	public void setBreathing_part(String breathing_part) {
		this.breathing_part = breathing_part;
	}
	public String getBlood_clot() {
		return blood_clot;
	}
	public void setBlood_clot(String blood_clot) {
		this.blood_clot = blood_clot;
	}
	public String getBreathing_pain() {
		return breathing_pain;
	}
	public void setBreathing_pain(String breathing_pain) {
		this.breathing_pain = breathing_pain;
	}
	public String getLung_prob() {
		return lung_prob;
	}
	public void setLung_prob(String lung_prob) {
		this.lung_prob = lung_prob;
	}
	public String getExpected_issue() {
		return expected_issue;
	}
	public void setExpected_issue(String expected_issue) {
		this.expected_issue = expected_issue;
	}
	public String getMention_incident() {
		return mention_incident;
	}
	public void setMention_incident(String mention_incident) {
		this.mention_incident = mention_incident;
	}
	public String getPossible_disease() {
		return possible_disease;
	}
	public void setPossible_disease(String possible_disease) {
		this.possible_disease = possible_disease;
	}
	
	@Override
	public String toString() {
		return "SurveyDetails [sur_det_id=" + sur_det_id + ", survey_id=" + survey_id + ", user_id=" + user_id
				+ ", health_num=" + health_num + ", age=" + age + ", weight=" + weight + ", height=" + height
				+ ", comunity=" + comunity + ", village=" + village + ", video=" + video + ", name=" + name + ", town="
				+ town + ", obesity=" + obesity + ", pain_start=" + pain_start + ", pain_exactly=" + pain_exactly
				+ ", better=" + better + ", worse=" + worse + ", radiate_site=" + radiate_site + ", pain_similar="
				+ pain_similar + ", pain_bad=" + pain_bad + ", pain_kind=" + pain_kind + ", bleeding=" + bleeding
				+ ", baby_moving=" + baby_moving + ", discharge=" + discharge + ", symptoms=" + symptoms + ", urinary="
				+ urinary + ", renal_stone=" + renal_stone + ", symptoms_text=" + symptoms_text
				+ ", urinary_symptoms_text=" + urinary_symptoms_text + ", answer1=" + answer1 + ", answer2=" + answer2
				+ ", answer3=" + answer3 + ", answer4=" + answer4 + ", answer5=" + answer5 + ", answer6=" + answer6
				+ ", answer7=" + answer7 + ", uans1=" + uans1 + ", uans2=" + uans2 + ", uans3=" + uans3 + ", uans4="
				+ uans4 + ", uans5=" + uans5 + ", uans6=" + uans6 + ", uans7=" + uans7 + ", dateofcreation="
				+ dateofcreation + ", updatedDate=" + updatedDate + ", breathing_part=" + breathing_part
				+ ", blood_clot=" + blood_clot + ", breathing_pain=" + breathing_pain + ", lung_prob=" + lung_prob
				+ ", expected_issue=" + expected_issue + ", mention_incident=" + mention_incident
				+ ", possible_disease=" + possible_disease + "]";
	}
}
