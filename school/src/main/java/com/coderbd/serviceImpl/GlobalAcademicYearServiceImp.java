package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.global.GlobalAcademicYear;
import com.coderbd.repository.GlobalAcademicYearRepository;
import com.coderbd.service.GlobalAcademicYearService;



@Service("globalAcademicYearService")
@Repository
@Transactional
public class GlobalAcademicYearServiceImp implements GlobalAcademicYearService{
	final static Logger logger = LoggerFactory.getLogger(GlobalAcademicYearServiceImp.class);
	
	@Autowired
	private GlobalAcademicYearRepository globalAcademicYearRepository;

	@Override
	public void create(GlobalAcademicYear globalAcademicYear) {
	globalAcademicYearRepository.saveAndFlush(globalAcademicYear);
		
	}

	@Override
	public void update(GlobalAcademicYear globalAcademicYear) {
		globalAcademicYearRepository.saveAndFlush(globalAcademicYear);
		
	}

	@Override
	public void delete(GlobalAcademicYear globalAcademicYear) {
		globalAcademicYearRepository.delete(globalAcademicYear);
		
	}

	@Override
	public Iterable<GlobalAcademicYear> findAll() {
		return globalAcademicYearRepository.findAll();
	}

}
