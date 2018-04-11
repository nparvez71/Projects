package com.coderbd.service;

import com.coderbd.entity.core.GroupConfig;


public interface GroupConfigService {
	public void create(GroupConfig groupConfig);
	public void update(GroupConfig groupConfig);
	public void delete(GroupConfig groupConfig);
	public Iterable<GroupConfig> findAll();
}
