package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingGroup;

public interface CoreSettingGroupService {

	public void create(CoreSettingGroup coreSettingGroup);

	public void update(CoreSettingGroup coreSettingGroup);

	public void delete(CoreSettingGroup coreSettingGroup);

	public Iterable<CoreSettingGroup> findAll();

	
	

}
