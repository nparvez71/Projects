package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingClassConfig;
import com.coderbd.repository.CoreSettingClassConfigRepository;
import com.coderbd.service.CoreSettingClassConfigService;




@Service("coreSettingClassConfigService")
@Repository
@Transactional
public class CoreSettingClassConfigServiceImp implements CoreSettingClassConfigService{
	final static Logger logger = LoggerFactory.getLogger(CoreSettingClassConfigServiceImp.class);
	
	@Autowired
	private CoreSettingClassConfigRepository coreSettingClassConfigRepository;

	@Override
	public void create(CoreSettingClassConfig coreSettingClassConfig) {
		coreSettingClassConfigRepository.saveAndFlush(coreSettingClassConfig);		
	}

	@Override
	public void update(CoreSettingClassConfig coreSettingClassConfig) {
		coreSettingClassConfigRepository.saveAndFlush(coreSettingClassConfig);		
	}

	@Override
	public void delete(CoreSettingClassConfig coreSettingClassConfig) {
		coreSettingClassConfigRepository.delete(coreSettingClassConfig);		
	}

	@Override
	public Iterable<CoreSettingClassConfig> findAll() {
		return coreSettingClassConfigRepository.findAll();
	}

	
}
