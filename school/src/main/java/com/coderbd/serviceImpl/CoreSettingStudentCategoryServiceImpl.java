package com.coderbd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingStudentCategory;
import com.coderbd.repository.CoreSettingStudentCategoryRepository;
import com.coderbd.service.CoreSettingStudentCategoryService;

@Service("coreSettingStudentCategoryService")
@Repository
@Transactional
public class CoreSettingStudentCategoryServiceImpl implements CoreSettingStudentCategoryService{
@Autowired
CoreSettingStudentCategoryRepository coreSettingStudentCategoryRepository ;
	@Override
	public void create(CoreSettingStudentCategory coreSettingStudentCategory) {
		// TODO Auto-generated method stub
		coreSettingStudentCategoryRepository.saveAndFlush(coreSettingStudentCategory);
	}

	@Override
	public void update(CoreSettingStudentCategory coreSettingStudentCategory) {
		// TODO Auto-generated method stub
		coreSettingStudentCategoryRepository.saveAndFlush(coreSettingStudentCategory);
		
	}

	@Override
	public void delete(CoreSettingStudentCategory coreSettingStudentCategory) {
		// TODO Auto-generated method stub
		coreSettingStudentCategoryRepository.delete(coreSettingStudentCategory);
		
	}

	@Override
	public Iterable<CoreSettingStudentCategory> findAll() {
		// TODO Auto-generated method stub
		return coreSettingStudentCategoryRepository.findAll();
	}

}
