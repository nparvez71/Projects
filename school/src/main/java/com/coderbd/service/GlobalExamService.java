package com.coderbd.service;

import com.coderbd.entity.global.GlobalExam;

public interface GlobalExamService {
	public void create(GlobalExam globalExam);
	public void update(GlobalExam globalExam);
	public void delete(GlobalExam globalExam);
	public Iterable<GlobalExam> findAll();

}
