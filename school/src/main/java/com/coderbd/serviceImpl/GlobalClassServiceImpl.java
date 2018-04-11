package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.global.GlobalClass;
import com.coderbd.repository.GlobalClassRepository;
import com.coderbd.service.GlobalClassService;

@Service("globalClassService")
@Repository
@Transactional
public class GlobalClassServiceImpl implements GlobalClassService {
	final static Logger logger = LoggerFactory.getLogger(GlobalClassServiceImpl.class);
	
	@Autowired
	private GlobalClassRepository repository;
	
	@Override
	public void create(GlobalClass globalClass) {
		repository.saveAndFlush(globalClass);
	}

	@Override
	public void update(GlobalClass globalClass) {
		repository.saveAndFlush(globalClass);
	}

	@Override
	public void delete(GlobalClass globalClass) {
		repository.delete(globalClass);
		
	}

	@Override
	public Iterable<GlobalClass> findAll() {
				return repository.findAll();
	}

}
