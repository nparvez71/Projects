package com.coderbd.service;


import com.coderbd.entity.global.GlobalExamGrade;

public interface GlobalExamGradeService {
	public void create(GlobalExamGrade globalExamGrade);
	public void update(GlobalExamGrade globalExamGrade);
	public void delete(GlobalExamGrade globalExamGrade);
	public Iterable<GlobalExamGrade> findAll();

}
