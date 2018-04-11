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

import com.coderbd.entity.global.GlobalClass;
import com.coderbd.service.GlobalClassService;


@ManagedBean
@Component(value = "globalClassMB")
@ViewScoped
public class GlobalClassController {

	@Autowired
	private GlobalClassService service;
	private GlobalClass bean;
	private GlobalClass beanSelected;
	private Iterable<GlobalClass> list;
	private Iterable<GlobalClass> listSelected;

	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new GlobalClass();
		this.beanSelected = new GlobalClass();
		this.list = new ArrayList<GlobalClass>();
		this.listSelected = new ArrayList<GlobalClass>();
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
	
	
	

	public GlobalClass getBean() {
		if(bean == null ) {
			bean=new GlobalClass();
		}
		return bean;
	}
	public void setBean(GlobalClass bean) {
		this.bean = bean;
	}
	public GlobalClass getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new GlobalClass();
		}
		return beanSelected;
	}
	public void setBeanSelected(GlobalClass beanSelected) {
		this.beanSelected = beanSelected;
	}
	public Iterable<GlobalClass> getList() {
		return list;
	}
	public void setList(Iterable<GlobalClass> list) {
		this.list = list;
	}
	public Iterable<GlobalClass> getListSelected() {
		return listSelected;
	}
	public void setListSelected(Iterable<GlobalClass> listSelected) {
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
