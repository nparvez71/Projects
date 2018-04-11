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


import com.coderbd.entity.global.GlobalGroup;

import com.coderbd.service.GlobalGroupService;

@ManagedBean
@Component(value = "globalGroupMB")
@ViewScoped
public class GlobalGroupController {
	@Autowired
	private GlobalGroupService service;
	private GlobalGroup bean;
	private GlobalGroup beanSelected;
	private Iterable<GlobalGroup> list;
	private Iterable<GlobalGroup> listSelected;

	@PostConstruct
	public void init() {
		refreshList();
	}

	private void refreshList() {
		this.bean = new GlobalGroup();
		this.beanSelected = new GlobalGroup();
		this.list = new ArrayList<GlobalGroup>();
		this.listSelected = new ArrayList<GlobalGroup>();
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
	public GlobalGroup getBean() {
		if(bean == null ) {
			bean=new GlobalGroup();
		}
		return bean;
	}
	public void setBean(GlobalGroup bean) {
		this.bean = bean;
	}
	public GlobalGroup getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new GlobalGroup();
		}
		return beanSelected;
	}
	public void setBeanSelected(GlobalGroup beanSelected) {
		this.beanSelected = beanSelected;
	}
	public Iterable<GlobalGroup> getList() {
		list=service.findAll();
		return list;
	}
	public void setList(Iterable<GlobalGroup> list) {
		this.list = list;
	}
	public Iterable<GlobalGroup> getListSelected() {
		return listSelected;
	}
	public void setListSelected(Iterable<GlobalGroup> listSelected) {
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
