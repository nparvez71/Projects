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

import com.coderbd.entity.core.CoreSettingSubjectConfig;
import com.coderbd.service.CoreSettingSubjectConfigService;

@ManagedBean
@Component(value = "coreSettingSubjectConfigMB")
@ViewScoped
public class CoreSettingSubjectConfigController {
	@Autowired
	private   CoreSettingSubjectConfigService  coreSettingSubjectConfigService;
	private   CoreSettingSubjectConfig bean;
	private   CoreSettingSubjectConfig beanSelected;
	private Iterable<  CoreSettingSubjectConfig> list;
	private Iterable<  CoreSettingSubjectConfig> listSelected;
	
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	
	public void refreshList() {
		this.bean = new CoreSettingSubjectConfig();
		this.beanSelected = new CoreSettingSubjectConfig();
		this.list = new ArrayList<CoreSettingSubjectConfig>();
		this.listSelected = new ArrayList<CoreSettingSubjectConfig>();
		try {
			list=coreSettingSubjectConfigService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getInstituteID());
		try {
			if (bean != null) {
				coreSettingSubjectConfigService.create(bean);
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
	public String update() {
		try {
			if (beanSelected != null) {
				coreSettingSubjectConfigService.update(beanSelected);
				refreshList();
			}
			notificationSuccess("Update Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public String delete() {
		try {
			if (beanSelected != null) {
				coreSettingSubjectConfigService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public CoreSettingSubjectConfig getBean() {
		if(bean == null ) {
			bean=new CoreSettingSubjectConfig();
		}
		return bean;
	}
	public void setBean(CoreSettingSubjectConfig bean) {
		this.bean = bean;
	}
	public CoreSettingSubjectConfig getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new CoreSettingSubjectConfig();
		}
		return beanSelected;
	}

	public void setBeanSelected(CoreSettingSubjectConfig beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<CoreSettingSubjectConfig> getList() {
		list=coreSettingSubjectConfigService.findAll();
		return list;
	}

	public void setList(Iterable<CoreSettingSubjectConfig> list) {
		this.list = list;
	}

	public Iterable<CoreSettingSubjectConfig> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<CoreSettingSubjectConfig> listSelected) {
		this.listSelected = listSelected;
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
