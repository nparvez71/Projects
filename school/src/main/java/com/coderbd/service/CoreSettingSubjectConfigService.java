package com.coderbd.service;

import com.coderbd.entity.core.CoreSettingSubjectConfig;

public interface CoreSettingSubjectConfigService {
	public void create(CoreSettingSubjectConfig coreSettingSubjectConfig);
	public void update(CoreSettingSubjectConfig coreSettingSubjectConfig);
	public void delete(CoreSettingSubjectConfig coreSettingSubjectConfig);
	public Iterable<CoreSettingSubjectConfig> findAll();
}
