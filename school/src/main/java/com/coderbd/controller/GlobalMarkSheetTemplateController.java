package com.coderbd.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coderbd.entity.global.GlobalMarkSheetTemplate;
import com.coderbd.service.GlobalMarkSheetTemplateService;

@ManagedBean
@Component(value="globalMarkSheetTemplateControllerMB")
@ViewScoped
public class GlobalMarkSheetTemplateController {
	
	@Autowired
	private GlobalMarkSheetTemplateService globalMarkSheetTemplateService;
	private GlobalMarkSheetTemplate bean;
	private GlobalMarkSheetTemplate beanSelected;
	private Iterable<GlobalMarkSheetTemplate> list;
	private Iterable<GlobalMarkSheetTemplate> listSelected;
	
	
	public GlobalMarkSheetTemplateService getGlobalMarkSheetTemplateService() {
		return globalMarkSheetTemplateService;
	}

	public void setGlobalMarkSheetTemplateService(GlobalMarkSheetTemplateService globalMarkSheetTemplateService) {
		this.globalMarkSheetTemplateService = globalMarkSheetTemplateService;
	}

	public GlobalMarkSheetTemplate getBean() {
		if(bean == null ) {
			bean=new GlobalMarkSheetTemplate();
		}
		return bean;
	}

	public void setBean(GlobalMarkSheetTemplate bean) {
		this.bean = bean;
	}

	public GlobalMarkSheetTemplate getBeanSelected() {
		if(beanSelected == null) {
			beanSelected=new GlobalMarkSheetTemplate();
		}
		return beanSelected;
	}

	public void setBeanSelected(GlobalMarkSheetTemplate beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<GlobalMarkSheetTemplate> getList() {
		return list;
	}

	public void setList(Iterable<GlobalMarkSheetTemplate> list) {
		this.list = list;
	}

	public Iterable<GlobalMarkSheetTemplate> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<GlobalMarkSheetTemplate> listSelected) {
		this.listSelected = listSelected;
	}

	@PostConstruct
	public void init() {
		refreshList();
	}

	// define refreshList() method
	public void refreshList() {
		this.bean = new GlobalMarkSheetTemplate();
		this.beanSelected = new GlobalMarkSheetTemplate();
		this.list = new ArrayList<GlobalMarkSheetTemplate>();
		this.listSelected = new ArrayList<GlobalMarkSheetTemplate>();
		try {
			list = globalMarkSheetTemplateService.findAll();
			listSelected = list;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// data insert
	public String insert() {
		System.out.println("Sami............"+bean.getTemplateName());
		try {
			if (bean != null) {
				globalMarkSheetTemplateService.create(bean);
				reset();
				refreshList();
			}
			notificationSuccess("Insert Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	//update data
	public String update() {
		try {
			if (beanSelected != null) {
				globalMarkSheetTemplateService.update(beanSelected);
				refreshList();
			}
			notificationSuccess("Update Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	//Delete data
	public String delete() {
		try {
			if (beanSelected != null) {
				globalMarkSheetTemplateService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	
	public void reset() {

		RequestContext.getCurrentInstance().reset("form1:panel");
	}

	public void notificationSuccess(String operation) {
		FacesMessage msg = null;
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, operation, "Success");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void notificationError(Exception e, String operation) {
		FacesMessage msg = null;
		msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, operation, "Error");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
