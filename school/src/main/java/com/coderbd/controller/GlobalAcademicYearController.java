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
import com.coderbd.entity.global.GlobalAcademicYear;
import com.coderbd.service.GlobalAcademicYearService;


@ManagedBean
@Component(value = "globalAcademicYearMB")
@ViewScoped
public class GlobalAcademicYearController {

	@Autowired
	private GlobalAcademicYearService service;
	private GlobalAcademicYear bean;
	private GlobalAcademicYear beanSelected;
	private Iterable<GlobalAcademicYear> list;
	private Iterable<GlobalAcademicYear> listSelected;

	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new GlobalAcademicYear();
		this.beanSelected = new GlobalAcademicYear();
		this.list = new ArrayList<GlobalAcademicYear>();
		this.listSelected = new ArrayList<GlobalAcademicYear>();
		try {
			list=service.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String insert() {
		System.out.println("Sami............"+bean.getAcademicYear());
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
	
	
	


	public GlobalAcademicYear getBean() {
		if(bean == null ) {
			bean=new GlobalAcademicYear();
		}
		return bean;
	}
	public void setBean(GlobalAcademicYear bean) {
		this.bean = bean;
	}
	public GlobalAcademicYear getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new GlobalAcademicYear();
		}
		return beanSelected;
	}

	public void setBeanSelected(GlobalAcademicYear beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<GlobalAcademicYear> getList() {
		list=service.findAll();
		return list;
	}

	public void setList(Iterable<GlobalAcademicYear> list) {
		this.list = list;
	}

	public Iterable<GlobalAcademicYear> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<GlobalAcademicYear> listSelected) {
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
