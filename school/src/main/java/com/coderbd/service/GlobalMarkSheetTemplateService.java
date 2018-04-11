package com.coderbd.service;

import com.coderbd.entity.global.GlobalMarkSheetTemplate;

public interface GlobalMarkSheetTemplateService {	
	public void create(GlobalMarkSheetTemplate globalMarkSheetTemplate);
	
	public void update(GlobalMarkSheetTemplate globalMarkSheetTemplate);
	
	public void delete(GlobalMarkSheetTemplate globalMarkSheetTemplate);
	
	public Iterable<GlobalMarkSheetTemplate> findAll();
	
	public GlobalMarkSheetTemplate findByTemplateName(String string);

}
