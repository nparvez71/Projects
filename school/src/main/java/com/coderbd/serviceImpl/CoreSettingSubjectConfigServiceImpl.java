package com.coderbd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingSubjectConfig;
import com.coderbd.repository.CoreSettingSubjectConfigRepository;
import com.coderbd.service.CoreSettingSubjectConfigService;
@Service("coreSettingSubjectConfigService")
@Repository
@Transactional
public class CoreSettingSubjectConfigServiceImpl implements CoreSettingSubjectConfigService{
@Autowired
CoreSettingSubjectConfigRepository coreSettingSubjectConfigRepository;
	@Override
	public void create(CoreSettingSubjectConfig coreSettingSubjectConfig) {
		// TODO Auto-generated method stub
		coreSettingSubjectConfigRepository.saveAndFlush(coreSettingSubjectConfig);
	}

	@Override
	public void update(CoreSettingSubjectConfig coreSettingSubjectConfig) {
		// TODO Auto-generated method stub
		coreSettingSubjectConfigRepository.saveAndFlush(coreSettingSubjectConfig);
	}

	@Override
	public void delete(CoreSettingSubjectConfig coreSettingSubjectConfig) {
		// TODO Auto-generated method stub
		coreSettingSubjectConfigRepository.delete(coreSettingSubjectConfig);
	}

	@Override
	public Iterable<CoreSettingSubjectConfig> findAll() {
		// TODO Auto-generated method stub
		return coreSettingSubjectConfigRepository.findAll();
	}

}
