package com.coderbd.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.core.CoreSettingStdAttendancePeriod;

import com.coderbd.repository.CoreSettingStdAttendancePeriodRepository;
import com.coderbd.service.CoreSettingStdAttendancePeriodService;

@Service("coreSettingStdAttendancePeriodService")
@Repository
@Transactional

public class CoreSettingStdAttendancePeriodServiceImpl implements CoreSettingStdAttendancePeriodService{

	@Autowired
	CoreSettingStdAttendancePeriodRepository coreSettingStdAttendancePeriodRepository;
	
	@Override
	public void create(CoreSettingStdAttendancePeriod coreSettingStdAttendancePeriod) {
		// TODO Auto-generated method stub
		coreSettingStdAttendancePeriodRepository.saveAndFlush(coreSettingStdAttendancePeriod);
	}

	@Override
	public void update(CoreSettingStdAttendancePeriod coreSettingStdAttendancePeriod) {
		// TODO Auto-generated method stub
		coreSettingStdAttendancePeriodRepository.saveAndFlush(coreSettingStdAttendancePeriod);
	}

	@Override
	public void delete(CoreSettingStdAttendancePeriod coreSettingStdAttendancePeriod) {
		// TODO Auto-generated method stub
		coreSettingStdAttendancePeriodRepository.delete(coreSettingStdAttendancePeriod);
	}

	@Override
	public Iterable<CoreSettingStdAttendancePeriod> findAll() {
		// TODO Auto-generated method stub
		return coreSettingStdAttendancePeriodRepository.findAll();
	}

}
