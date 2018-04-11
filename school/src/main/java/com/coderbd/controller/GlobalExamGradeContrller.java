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
import com.coderbd.entity.global.GlobalExamGrade;
import com.coderbd.service.GlobalExamGradeService;
import com.coderbd.service.GlobalExamService;

@ManagedBean
@Component(value = "globalExamGradeMB")
@ViewScoped
public class GlobalExamGradeContrller {
	
	@Autowired
	private GlobalExamGradeService globalExamGradeService;
	private GlobalExamGrade bean;
	private GlobalExamGrade beanSelected;
	private Iterable<GlobalExamGrade> list;
	private Iterable<GlobalExamGrade> listSelected;
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new GlobalExamGrade();
		this.beanSelected = new GlobalExamGrade();
		this.list = new ArrayList<GlobalExamGrade>();
		this.listSelected = new ArrayList<GlobalExamGrade>();
		try {
			list=globalExamGradeService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getExamGradeName());
		try {
			if (bean != null) {
				globalExamGradeService.create(bean);
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
				globalExamGradeService.update(beanSelected);
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
				globalExamGradeService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public GlobalExamGrade getBean() {
		if(bean == null ) {
			bean=new GlobalExamGrade();
		}
		return bean;
	}
	public void setBean(GlobalExamGrade bean) {
		this.bean = bean;
	}
	public GlobalExamGrade getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new GlobalExamGrade();
		}
		return beanSelected;
	}

	public void setBeanSelected(GlobalExamGrade beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<GlobalExamGrade> getList() {
		list=globalExamGradeService.findAll();
		
		return list;
	}

	public void setList(Iterable<GlobalExamGrade> list) {
		this.list = list;
	}

	public Iterable<GlobalExamGrade> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<GlobalExamGrade> listSelected) {
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
