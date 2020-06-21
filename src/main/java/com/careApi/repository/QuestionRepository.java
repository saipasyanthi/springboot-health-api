package com.careApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careApi.model.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long>  {


    List<Question> findAllBySurvey(Long survey_id);

}
