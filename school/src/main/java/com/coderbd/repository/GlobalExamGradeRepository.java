package com.coderbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderbd.entity.global.GlobalExamGrade;


@Repository
public interface GlobalExamGradeRepository extends JpaRepository<GlobalExamGrade, Long>{

}
