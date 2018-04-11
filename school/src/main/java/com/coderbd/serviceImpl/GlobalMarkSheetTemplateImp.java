package com.coderbd.serviceImpl;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.global.GlobalMarkSheetTemplate;
import com.coderbd.repository.GlobalMarkSheetTemplateRepository;
import com.coderbd.service.GlobalMarkSheetTemplateService;

@Service("globalMarkSheetTemplateService")
@Repository
@Transactional
public class GlobalMarkSheetTemplateImp implements GlobalMarkSheetTemplateService{
	final static Logger LOGGER = LoggerFactory.getLogger(GlobalMarkSheetTemplateService.class);
	
	@Autowired
	GlobalMarkSheetTemplateRepository globalMarkSheetTemplateRepository;
	
	@Override
	public void create(@Valid GlobalMarkSheetTemplate globalMarkSheetTemplate) {
		GlobalMarkSheetTemplate globalMarkSheetTemplateExists = globalMarkSheetTemplateRepository.findByTemplateName(globalMarkSheetTemplate.getTemplateName());
		if(globalMarkSheetTemplateExists != null) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Grup Already Exist!", null));
		}
		if (globalMarkSheetTemplate != null) {
			globalMarkSheetTemplate.setDateExecuted(new Date());
			globalMarkSheetTemplate.setRecordStatus(1);
			globalMarkSheetTemplateRepository.saveAndFlush(globalMarkSheetTemplate);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Successfully Saved!", null));
		}
		
	}

	@Override
	public void update(GlobalMarkSheetTemplate globalMarkSheetTemplate) {
		globalMarkSheetTemplateRepository.saveAndFlush(globalMarkSheetTemplate);
		
	}

	@Override
	public void delete(GlobalMarkSheetTemplate globalMarkSheetTemplate) {
		globalMarkSheetTemplateRepository.saveAndFlush(globalMarkSheetTemplate);
		
	}

	@Override
	public Iterable<GlobalMarkSheetTemplate> findAll() {
		return globalMarkSheetTemplateRepository.findAll();
	}

	@Override
	public GlobalMarkSheetTemplate findByTemplateName(String string) {
		return globalMarkSheetTemplateRepository.findByTemplateName(string);
	}

}
