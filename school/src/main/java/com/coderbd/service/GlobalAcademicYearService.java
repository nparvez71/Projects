package com.coderbd.service;

import com.coderbd.entity.global.GlobalAcademicYear;



public interface GlobalAcademicYearService {

	public void create(GlobalAcademicYear globalAcademicYear);

	public void update(GlobalAcademicYear globalAcademicYear);

	public void delete(GlobalAcademicYear globalAcademicYear);

	public Iterable<GlobalAcademicYear> findAll();

	
	

	
}
