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

import com.coderbd.entity.core.GroupConfig;
import com.coderbd.service.GroupConfigService;

@ManagedBean
@Component(value = "groupConfigMB")
@ViewScoped
public class GroupConfigController {
	@Autowired
	private   GroupConfigService  groupConfigService;
	private   GroupConfig bean;
	private   GroupConfig beanSelected;
	private Iterable<  GroupConfig> list;
	private Iterable<  GroupConfig> listSelected;
	
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	
	public void refreshList() {
		this.bean = new GroupConfig();
		this.beanSelected = new GroupConfig();
		this.list = new ArrayList<GroupConfig>();
		this.listSelected = new ArrayList<GroupConfig>();
		try {
			list=groupConfigService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getInstituteID());
		try {
			if (bean != null) {
				groupConfigService.create(bean);
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
				groupConfigService.update(beanSelected);
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
				groupConfigService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public GroupConfig getBean() {
		if(bean == null ) {
			bean=new GroupConfig();
		}
		return bean;
	}
	public void setBean(GroupConfig bean) {
		this.bean = bean;
	}
	public GroupConfig getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new GroupConfig();
		}
		return beanSelected;
	}

	public void setBeanSelected(GroupConfig beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<GroupConfig> getList() {
		list=groupConfigService.findAll();
		return list;
	}

	public void setList(Iterable<GroupConfig> list) {
		this.list = list;
	}

	public Iterable<GroupConfig> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<GroupConfig> listSelected) {
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
