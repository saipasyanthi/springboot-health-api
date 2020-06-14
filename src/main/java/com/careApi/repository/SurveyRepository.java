package com.careApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careApi.model.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long>  {

}
