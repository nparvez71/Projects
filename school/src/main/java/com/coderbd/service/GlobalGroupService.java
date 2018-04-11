package com.coderbd.service;


import com.coderbd.entity.global.GlobalGroup;

public interface GlobalGroupService {
	public void create(GlobalGroup globalGroup);

	public void update(GlobalGroup globalGroup);

	public void delete(GlobalGroup globalGroup);

	public Iterable<GlobalGroup> findAll();

}
