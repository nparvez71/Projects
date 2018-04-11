package com.coderbd.service;

import com.coderbd.entity.global.GlobalDesignation;

public interface DesignationService {
	public void create(GlobalDesignation globalDesignation);

	public void update(GlobalDesignation globalDesignation);

	public void delete(GlobalDesignation globalDesignation);

	public Iterable<GlobalDesignation> findAll();

	public GlobalDesignation findByDesignationName(String designationName);
}
