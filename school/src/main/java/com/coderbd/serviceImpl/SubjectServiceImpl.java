package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.UserRole;
import com.coderbd.entity.global.GlobalSubject;
import com.coderbd.repository.RoleRepository;
import com.coderbd.repository.SubjectRepository;
import com.coderbd.service.SubjectService;

@Service("SubjectService")
@Repository
@Transactional
public class SubjectServiceImpl implements SubjectService {
	final static Logger logger = LoggerFactory.getLogger(SubjectServiceImpl.class);

	@Autowired
	private SubjectRepository subjectRepository;

	@Override
	public void create(GlobalSubject globalSubject) {
		subjectRepository.saveAndFlush(globalSubject);
		
	}

	@Override
	public void update(GlobalSubject globalSubject) {
		subjectRepository.saveAndFlush(globalSubject);
		
	}

	@Override
	public void delete(GlobalSubject globalSubject) {
		subjectRepository.delete(globalSubject);
		
	}

	@Override
	public Iterable<GlobalSubject> findAll() {
		return subjectRepository.findAll();
	}

	@Override
	public GlobalSubject findBySubjectName(String subjectName) {
		// TODO Auto-generated method stub
		return subjectRepository.findBySubjectName(subjectName);
	}
	
}
