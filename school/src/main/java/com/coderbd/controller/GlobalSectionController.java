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


import com.coderbd.entity.global.GlobalSection;

import com.coderbd.service.GlobalSectionService;

@ManagedBean
@Component(value = "globalSectionMB")
@ViewScoped
public class GlobalSectionController {
	@Autowired
	private GlobalSectionService service;
	private GlobalSection bean;
	private GlobalSection beanSelected;
	private Iterable<GlobalSection> list;
	private Iterable<GlobalSection> listSelected;

	@PostConstruct
	public void init() {
		refreshList();
	}

	public void refreshList() {
		this.bean = new GlobalSection();
		this.beanSelected = new GlobalSection();
		this.list = new ArrayList<GlobalSection>();
		this.listSelected = new ArrayList<GlobalSection>();
		try {
			list=service.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String insert() {

		try {
			if (bean != null) {
				service.create(bean);
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

	public void reset() {

		RequestContext.getCurrentInstance().reset("form1:panel");
	}


	public String update() {
		try {
			if (beanSelected != null) {
				service.update(beanSelected);
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
				service.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public GlobalSection getBean() {
		if(bean == null ) {
			bean=new GlobalSection();
		}
	return bean;
	}

	public void setBean(GlobalSection bean) {
		this.bean = bean;
	}

	public GlobalSection getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new GlobalSection();
		}
		return beanSelected;
	}

	public void setBeanSelected(GlobalSection beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<GlobalSection> getList() {
		return list;
	}

	public void setList(Iterable<GlobalSection> list) {
		this.list = list;
	}

	public Iterable<GlobalSection> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<GlobalSection> listSelected) {
		this.listSelected = listSelected;
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
