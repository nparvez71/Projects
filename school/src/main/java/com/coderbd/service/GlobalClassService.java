package com.coderbd.service;


import com.coderbd.entity.global.GlobalClass;

public interface GlobalClassService {
	public void create(GlobalClass globalClass);

	public void update(GlobalClass globalClass);

	public void delete(GlobalClass globalClass);

	public Iterable<GlobalClass> findAll();

}
