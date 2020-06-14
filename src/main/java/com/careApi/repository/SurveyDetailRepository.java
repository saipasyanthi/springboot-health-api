package com.careApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careApi.model.SurveyDetails;
@Repository
public interface SurveyDetailRepository extends JpaRepository<SurveyDetails,Long> {

}
