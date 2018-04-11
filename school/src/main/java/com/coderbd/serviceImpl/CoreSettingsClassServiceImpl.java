package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingsClass;
import com.coderbd.repository.CoreSettingsClassRepository;
import com.coderbd.service.CoreSettingsClassService;

@Service("coreSettingsClassService")
@Repository
@Transactional
public class CoreSettingsClassServiceImpl implements CoreSettingsClassService {
	final static Logger logger = LoggerFactory.getLogger(CoreSettingsClassServiceImpl.class);
	
	@Autowired
	private CoreSettingsClassRepository coreSettingsClassRepository;

	@Override
	public void create(CoreSettingsClass coreSettingsClass) {
		coreSettingsClassRepository.saveAndFlush(coreSettingsClass)	;	
	}

	@Override
	public void update(CoreSettingsClass coreSettingsClass) {
		coreSettingsClassRepository.saveAndFlush(coreSettingsClass)	;	
		
	}

	@Override
	public void delete(CoreSettingsClass coreSettingsClass) {
		coreSettingsClassRepository.delete(coreSettingsClass)	;	
		
	}

	@Override
	public Iterable<CoreSettingsClass> findAll() {
		return coreSettingsClassRepository.findAll();
	}

	
}
