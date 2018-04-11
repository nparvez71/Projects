package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingSection;

public interface CoreSettingSectionService {

	public void create(CoreSettingSection coreSettingSection);

	public void update(CoreSettingSection coreSettingSection);

	public void delete(CoreSettingSection coreSettingSection);

	public Iterable<CoreSettingSection> findAll();

	
	

}
