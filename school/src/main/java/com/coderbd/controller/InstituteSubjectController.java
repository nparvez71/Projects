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

import com.coderbd.entity.core.InstituteSubject;
import com.coderbd.service.InstituteSubjectService;

@ManagedBean
@Component(value = "instituteSubjectMB")
@ViewScoped
public class InstituteSubjectController {
	@Autowired
	private   InstituteSubjectService  instituteSubjectService;
	private   InstituteSubject bean;
	private   InstituteSubject beanSelected;
	private Iterable<  InstituteSubject> list;
	private Iterable<  InstituteSubject> listSelected;
	
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	
	public void refreshList() {
		this.bean = new InstituteSubject();
		this.beanSelected = new InstituteSubject();
		this.list = new ArrayList<InstituteSubject>();
		this.listSelected = new ArrayList<InstituteSubject>();
		try {
			list=instituteSubjectService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getSubjectName());
		try {
			if (bean != null) {
				instituteSubjectService.create(bean);
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
				instituteSubjectService.update(beanSelected);
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
				instituteSubjectService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public InstituteSubject getBean() {
		if(bean == null ) {
			bean=new InstituteSubject();
		}
		return bean;
	}
	public void setBean(InstituteSubject bean) {
		this.bean = bean;
	}
	public InstituteSubject getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new InstituteSubject();
		}
		return beanSelected;
	}

	public void setBeanSelected(InstituteSubject beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<InstituteSubject> getList() {
		list=instituteSubjectService.findAll();
		return list;
	}

	public void setList(Iterable<InstituteSubject> list) {
		this.list = list;
	}

	public Iterable<InstituteSubject> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<InstituteSubject> listSelected) {
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
