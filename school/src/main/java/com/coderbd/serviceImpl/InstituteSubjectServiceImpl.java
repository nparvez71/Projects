package com.coderbd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.InstituteSubject;
import com.coderbd.repository.InstituteSubjectRepository;
import com.coderbd.service.InstituteSubjectService;
@Service("instituteSubjectService")
@Repository
@Transactional
public class InstituteSubjectServiceImpl implements InstituteSubjectService{
@Autowired
InstituteSubjectRepository instituteSubjectRepository;

@Override
public void create(InstituteSubject instituteSubject) {
	// TODO Auto-generated method stub
	instituteSubjectRepository.saveAndFlush(instituteSubject);
}

@Override
public void update(InstituteSubject instituteSubject) {
	// TODO Auto-generated method stub
	instituteSubjectRepository.saveAndFlush(instituteSubject);
}

@Override
public void delete(InstituteSubject instituteSubject) {
	// TODO Auto-generated method stub
	instituteSubjectRepository.delete(instituteSubject);
}

@Override
public Iterable<InstituteSubject> findAll() {
	// TODO Auto-generated method stub
	return instituteSubjectRepository.findAll();
}


}
