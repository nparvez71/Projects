package com.coderbd.service;

import com.coderbd.entity.global.GlobalSubject;

public interface SubjectService {
	public void create(GlobalSubject globalSubject);

	public void update(GlobalSubject globalSubject);

	public void delete(GlobalSubject globalSubject);

	public Iterable<GlobalSubject> findAll();

	public GlobalSubject findBySubjectName(String subjectName);
}
