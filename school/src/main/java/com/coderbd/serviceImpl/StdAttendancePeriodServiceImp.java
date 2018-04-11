package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.coderbd.entity.global.StdAttendancePeriod;
import com.coderbd.repository.StdAttendancePeriodRepository;
import com.coderbd.service.StdAttendancePeriodService;



@Service("stdAttendancePeriodService")
@Repository
@Transactional
public class StdAttendancePeriodServiceImp implements StdAttendancePeriodService{
	final static Logger logger = LoggerFactory.getLogger(StdAttendancePeriodServiceImp.class);
	
	@Autowired
	private StdAttendancePeriodRepository stdAttendancePeriodRepository;

	@Override
	public void create(StdAttendancePeriod stdAttendancePeriod) {
		stdAttendancePeriodRepository.saveAndFlush(stdAttendancePeriod);
		
	}

	@Override
	public void update(StdAttendancePeriod stdAttendancePeriod) {
		stdAttendancePeriodRepository.saveAndFlush(stdAttendancePeriod);
		
	}

	@Override
	public void delete(StdAttendancePeriod stdAttendancePeriod) {
		stdAttendancePeriodRepository.delete(stdAttendancePeriod);
		
	}

	@Override
	public Iterable<StdAttendancePeriod> findAll() {
		return stdAttendancePeriodRepository.findAll();
	}

}
