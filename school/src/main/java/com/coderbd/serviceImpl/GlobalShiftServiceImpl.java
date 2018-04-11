package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.UserRole;
import com.coderbd.entity.global.GlobalShift;
import com.coderbd.repository.GlobalShiftRepository;
import com.coderbd.repository.RoleRepository;
import com.coderbd.service.RoleService;
import com.coderbd.service.GlobalShiftService;

@Service("globalShiftService")
@Repository
@Transactional
public class GlobalShiftServiceImpl implements GlobalShiftService{
	final static Logger logger = LoggerFactory.getLogger(GlobalShiftServiceImpl.class);

	@Autowired
	private GlobalShiftRepository globalShiftRepository;

//SHABIB HASAN The override methods
	@Override
	public void create(GlobalShift globalShift) {
		globalShiftRepository.saveAndFlush(globalShift);
		
	}

	@Override
	public void update(GlobalShift globalShift) {
		globalShiftRepository.saveAndFlush(globalShift);
		
	}

	@Override
	public void delete(GlobalShift globalShift) {
		globalShiftRepository.delete(globalShift);
		
	}

	@Override
	public Iterable<GlobalShift> findAll() {
		return globalShiftRepository.findAll();
	}
	
}
