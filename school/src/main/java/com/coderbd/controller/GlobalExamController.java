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

import com.coderbd.entity.global.GlobalExam;
import com.coderbd.service.GlobalExamService;

@ManagedBean
@Component(value = "globalExamMB")
@ViewScoped
public class GlobalExamController {
	
	@Autowired
	private GlobalExamService globalExamService;
	private GlobalExam bean;
	private GlobalExam beanSelected;
	private Iterable<GlobalExam> list;
	private Iterable<GlobalExam> listSelected;
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new GlobalExam();
		this.beanSelected = new GlobalExam();
		this.list = new ArrayList<GlobalExam>();
		this.listSelected = new ArrayList<GlobalExam>();
		try {
			list=globalExamService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getExamName());
		try {
			if (bean != null) {
				globalExamService.create(bean);
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
				globalExamService.update(beanSelected);
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
				globalExamService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public GlobalExam getBean() {
		if(bean == null ) {
			bean=new GlobalExam();
		}
		return bean;
	}
	public void setBean(GlobalExam bean) {
		this.bean = bean;
	}
	public GlobalExam getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new GlobalExam();
		}
		return beanSelected;
	}

	public void setBeanSelected(GlobalExam beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<GlobalExam> getList() {
		list=globalExamService.findAll();
		return list;
	}

	public void setList(Iterable<GlobalExam> list) {
		this.list = list;
	}

	public Iterable<GlobalExam> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<GlobalExam> listSelected) {
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
