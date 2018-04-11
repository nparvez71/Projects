package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingStdAttendancePeriod;


public interface CoreSettingStdAttendancePeriodService {
	public void create(CoreSettingStdAttendancePeriod coreSettingStdAttendancePeriod);
	public void update(CoreSettingStdAttendancePeriod coreSettingStdAttendancePeriod);
	public void delete(CoreSettingStdAttendancePeriod coreSettingStdAttendancePeriod);
	public Iterable<CoreSettingStdAttendancePeriod> findAll();
}
