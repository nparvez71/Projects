package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingsAcademicYear;



public interface CoreSettingsAcademicYearService {

	public void create(CoreSettingsAcademicYear coreSettingsAcademicYear);

	public void update(CoreSettingsAcademicYear coreSettingsAcademicYear);

	public void delete(CoreSettingsAcademicYear coreSettingsAcademicYear);

	public Iterable<CoreSettingsAcademicYear> findAll();

	
	

	
}
