package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingsAcademicYear;
import com.coderbd.repository.CoreSettingsAcademicYearRepository;
import com.coderbd.service.CoreSettingsAcademicYearService;

@Service("coreSettingsAcademicYearService")
@Repository
@Transactional
public class CoreSettingsAcademicYearServiceImpl implements CoreSettingsAcademicYearService {
	final static Logger logger = LoggerFactory.getLogger(CoreSettingsAcademicYearServiceImpl.class);
	
	@Autowired
	private CoreSettingsAcademicYearRepository coreSettingsAcademicYearRepository;

	@Override
	public void create(CoreSettingsAcademicYear coreSettingsAcademicYear) {
		coreSettingsAcademicYearRepository.saveAndFlush(coreSettingsAcademicYear);		
	}

	@Override
	public void update(CoreSettingsAcademicYear coreSettingsAcademicYear) {
		coreSettingsAcademicYearRepository.saveAndFlush(coreSettingsAcademicYear);		
		
	}

	@Override
	public void delete(CoreSettingsAcademicYear coreSettingsAcademicYear) {
		coreSettingsAcademicYearRepository.delete(coreSettingsAcademicYear);		
		
	}

	@Override
	public Iterable<CoreSettingsAcademicYear> findAll() {
		return coreSettingsAcademicYearRepository.findAll();
	}

	
}
