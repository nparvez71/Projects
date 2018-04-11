package com.coderbd.service;


import com.coderbd.entity.global.GlobalSection;

public interface GlobalSectionService {
	public void create(GlobalSection globalSection);

	public void update(GlobalSection globalSection);

	public void delete(GlobalSection globalSection);

	public Iterable<GlobalSection> findAll();


}
