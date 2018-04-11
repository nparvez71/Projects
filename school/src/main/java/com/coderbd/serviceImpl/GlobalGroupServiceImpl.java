package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.global.GlobalGroup;

import com.coderbd.repository.GlobalGroupRepository;
import com.coderbd.service.GlobalGroupService;

@Service("globalGroupService")
@Repository
@Transactional
public class GlobalGroupServiceImpl implements GlobalGroupService {
	final static Logger logger = LoggerFactory.getLogger(GlobalGroupServiceImpl.class);
	
	@Autowired
	private GlobalGroupRepository repository;
	
	@Override
	public void create(GlobalGroup globalGroup) {
		repository.saveAndFlush(globalGroup);
		
	}

	@Override
	public void update(GlobalGroup globalGroup) {
		repository.saveAndFlush(globalGroup);
		
	}

	@Override
	public void delete(GlobalGroup globalGroup) {
		repository.delete(globalGroup);
		
	}

	@Override
	public Iterable<GlobalGroup> findAll() {
		return repository.findAll();
	}

}
