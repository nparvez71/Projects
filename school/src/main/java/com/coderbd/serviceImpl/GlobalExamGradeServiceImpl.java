package com.coderbd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.global.GlobalExamGrade;
import com.coderbd.repository.GlobalExamGradeRepository;
import com.coderbd.service.GlobalExamGradeService;
@Service("globalExamGradeService")
@Repository
@Transactional
public class GlobalExamGradeServiceImpl implements GlobalExamGradeService {
	@Autowired
	private GlobalExamGradeRepository globalExamGradeRepository;

	@Override
	public void create(GlobalExamGrade globalExamGrade) {
		// TODO Auto-generated method stub
		globalExamGradeRepository.saveAndFlush(globalExamGrade);
	}

	@Override
	public void update(GlobalExamGrade globalExamGrade) {
		// TODO Auto-generated method stub
		globalExamGradeRepository.saveAndFlush(globalExamGrade);
	}

	@Override
	public void delete(GlobalExamGrade globalExamGrade) {
		// TODO Auto-generated method stub
		globalExamGradeRepository.delete(globalExamGrade);
	}

	@Override
	public Iterable<GlobalExamGrade> findAll() {
		// TODO Auto-generated method stub
		return globalExamGradeRepository.findAll();
	}

}
