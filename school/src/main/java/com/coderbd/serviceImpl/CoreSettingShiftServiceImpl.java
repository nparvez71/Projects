package com.coderbd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingShift;
import com.coderbd.repository.CoreSettingShiftRepository;
import com.coderbd.service.CoreSettingShiftService;

@Service("coreSettingShiftService")
@Repository
@Transactional

public class CoreSettingShiftServiceImpl implements  CoreSettingShiftService{
@Autowired
CoreSettingShiftRepository coreSettingShiftRepository;

@Override
public void create(CoreSettingShift coreSettingShift) {
	// TODO Auto-generated method stub
	coreSettingShiftRepository.saveAndFlush(coreSettingShift);
}

@Override
public void update(CoreSettingShift coreSettingShift) {
	// TODO Auto-generated method stub
	coreSettingShiftRepository.saveAndFlush(coreSettingShift);
}

@Override
public void delete(CoreSettingShift coreSettingShift) {
	// TODO Auto-generated method stub
	coreSettingShiftRepository.delete(coreSettingShift);
	
}

@Override
public Iterable<CoreSettingShift> findAll() {
	// TODO Auto-generated method stub
	return coreSettingShiftRepository.findAll();
}


}
