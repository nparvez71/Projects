package com.coderbd.serviceImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.global.GlobalSection;

import com.coderbd.repository.GlobalSectionRepository;
import com.coderbd.service.GlobalSectionService;

@Service("globalSectionService")
@Repository
@Transactional
public class GlobalSectionServiceImp implements GlobalSectionService{
	final static Logger logger = LoggerFactory.getLogger(GlobalSectionServiceImp.class);
	
	@Autowired
	private GlobalSectionRepository repository;

	@Override
	public void create(GlobalSection globalSection) {
		repository.saveAndFlush(globalSection);
		
	}

	@Override
	public void update(GlobalSection globalSection) {
		repository.saveAndFlush(globalSection);
		
	}

	@Override
	public void delete(GlobalSection globalSection) {
		repository.saveAndFlush(globalSection);
		
	}

	@Override
	public Iterable<GlobalSection> findAll() {
		return repository.findAll();
	}
	
	
}
