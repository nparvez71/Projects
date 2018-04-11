package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingStudentCategory;


public interface CoreSettingStudentCategoryService {
	public void create(CoreSettingStudentCategory coreSettingStudentCategory);
	public void update(CoreSettingStudentCategory coreSettingStudentCategory);
	public void delete(CoreSettingStudentCategory coreSettingStudentCategory);
	public Iterable<CoreSettingStudentCategory> findAll();
}
