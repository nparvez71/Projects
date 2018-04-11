package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingsClass;

public interface CoreSettingsClassService {

	public void create(CoreSettingsClass coreSettingsClass);

	public void update(CoreSettingsClass coreSettingsClass);

	public void delete(CoreSettingsClass coreSettingsClass);

	public Iterable<CoreSettingsClass> findAll();

	
	

}
