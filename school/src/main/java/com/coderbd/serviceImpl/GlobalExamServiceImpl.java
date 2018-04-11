package com.coderbd.serviceImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.global.GlobalExam;
import com.coderbd.repository.GlobalExamRepository;
import com.coderbd.service.GlobalExamService;
@Service("globalExamService")
@Repository
@Transactional
public class GlobalExamServiceImpl implements GlobalExamService{
	final static Logger logger = LoggerFactory.getLogger(GlobalExamServiceImpl.class);
	
	@Autowired
	private GlobalExamRepository globalExamRepository;

	@Override
	public void create(GlobalExam globalExam) {
		// TODO Auto-generated method stub
		globalExamRepository.saveAndFlush(globalExam);
		
	}

	@Override
	public void update(GlobalExam globalExam) {
		// TODO Auto-generated method stub
		globalExamRepository.saveAndFlush(globalExam);
		
	}

	@Override
	public void delete(GlobalExam globalExam) {
		// TODO Auto-generated method stub
		globalExamRepository.delete(globalExam);
		
	}

	@Override
	public Iterable<GlobalExam> findAll() {
		return globalExamRepository.findAll();
	}


	

}
