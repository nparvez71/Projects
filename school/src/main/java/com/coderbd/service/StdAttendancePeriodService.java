package com.coderbd.service;
import com.coderbd.entity.global.StdAttendancePeriod;


public interface StdAttendancePeriodService {

	public void create( StdAttendancePeriod stdAttendancePeriod);

	public void update(StdAttendancePeriod stdAttendancePeriod);

	public void delete(StdAttendancePeriod stdAttendancePeriod);

	public Iterable<StdAttendancePeriod> findAll();

	
}
