package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingSection;
import com.coderbd.repository.CoreSettingSectionRepository;
import com.coderbd.service.CoreSettingSectionService;

@Service("coreSettingSectionService")
@Repository
@Transactional
public class CoreSettingSectionServiceImpl implements CoreSettingSectionService {
	final static Logger logger = LoggerFactory.getLogger(CoreSettingSectionServiceImpl.class);
	
	@Autowired
	private CoreSettingSectionRepository coreSettingSectionRepository;

	@Override
	public void create(CoreSettingSection coreSettingSection) {
		coreSettingSectionRepository.saveAndFlush(coreSettingSection);		
	}

	@Override
	public void update(CoreSettingSection coreSettingSection) {
		coreSettingSectionRepository.saveAndFlush(coreSettingSection);		
		
	}

	@Override
	public void delete(CoreSettingSection coreSettingSection) {
		coreSettingSectionRepository.delete(coreSettingSection);		
		
	}

	@Override
	public Iterable<CoreSettingSection> findAll() {
		return coreSettingSectionRepository.findAll();
	}

	
}
