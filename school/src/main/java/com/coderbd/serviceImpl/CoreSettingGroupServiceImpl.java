package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingGroup;
import com.coderbd.repository.CoreSettingGroupRepository;
import com.coderbd.service.CoreSettingGroupService;

@Service("coreSettingGroupService")
@Repository
@Transactional
public class CoreSettingGroupServiceImpl implements CoreSettingGroupService {
	final static Logger logger = LoggerFactory.getLogger(CoreSettingGroupServiceImpl.class);
	
	@Autowired
	private CoreSettingGroupRepository coreSettingGroupRepository;

	@Override
	public void create(CoreSettingGroup coreSettingGroup) {
		coreSettingGroupRepository.saveAndFlush(coreSettingGroup);		
		
	}

	@Override
	public void update(CoreSettingGroup coreSettingGroup) {
		coreSettingGroupRepository.saveAndFlush(coreSettingGroup);		
		
	}

	@Override
	public void delete(CoreSettingGroup coreSettingGroup) {
		coreSettingGroupRepository.delete(coreSettingGroup);		
		
	}

	@Override
	public Iterable<CoreSettingGroup> findAll() {
		return coreSettingGroupRepository.findAll();
	}
	
	
}
