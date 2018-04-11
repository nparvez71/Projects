package com.coderbd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.GroupConfig;
import com.coderbd.repository.GroupConfigRepository;
import com.coderbd.service.GroupConfigService;
@Service("groupConfigService")
@Repository
@Transactional
public class GroupConfigServiceImpl implements GroupConfigService{
@Autowired
GroupConfigRepository groupConfigRepository;
	@Override
	public void create(GroupConfig groupConfig) {
		// TODO Auto-generated method stub
		groupConfigRepository.saveAndFlush(groupConfig);
	}

	@Override
	public void update(GroupConfig groupConfig) {
		// TODO Auto-generated method stub
		groupConfigRepository.saveAndFlush(groupConfig);
	}

	@Override
	public void delete(GroupConfig groupConfig) {
		// TODO Auto-generated method stub
		groupConfigRepository.delete(groupConfig);
	}

	@Override
	public Iterable<GroupConfig> findAll() {
		// TODO Auto-generated method stub
		return groupConfigRepository.findAll();
	}

}
