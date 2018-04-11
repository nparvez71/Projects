package com.coderbd.service;


import com.coderbd.entity.core.InstituteSubject;

public interface InstituteSubjectService {
	public void create(InstituteSubject instituteSubject);
	public void update(InstituteSubject instituteSubject);
	public void delete(InstituteSubject instituteSubject);
	public Iterable<InstituteSubject> findAll();

}
