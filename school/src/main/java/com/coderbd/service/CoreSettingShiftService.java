package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingShift;

public interface CoreSettingShiftService {
	public void create(CoreSettingShift coreSettingShift);
	public void update(CoreSettingShift coreSettingShift);
	public void delete(CoreSettingShift coreSettingShift);
	public Iterable<CoreSettingShift> findAll();

}
