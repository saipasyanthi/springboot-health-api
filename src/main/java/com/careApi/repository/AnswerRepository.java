package com.careApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careApi.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {

}
