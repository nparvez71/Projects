package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingClassConfig;



public interface CoreSettingClassConfigService {

	public void create(CoreSettingClassConfig coreSettingClassConfig);

	public void update(CoreSettingClassConfig coreSettingClassConfig);

	public void delete(CoreSettingClassConfig coreSettingClassConfig);

	public Iterable<CoreSettingClassConfig> findAll();

	
	

	
}
