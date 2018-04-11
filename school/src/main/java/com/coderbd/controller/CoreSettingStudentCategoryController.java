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

import com.coderbd.entity.core.CoreSettingStdAttendancePeriod;
import com.coderbd.entity.core.CoreSettingStudentCategory;
import com.coderbd.service.CoreSettingStdAttendancePeriodService;
import com.coderbd.service.CoreSettingStudentCategoryService;

@ManagedBean
@Component(value = "coreSettingStudentCategoryMB")
@ViewScoped
public class CoreSettingStudentCategoryController {
	@Autowired
	private   CoreSettingStudentCategoryService  coreSettingStudentCategoryService;
	private   CoreSettingStudentCategory bean;
	private   CoreSettingStudentCategory beanSelected;
	private Iterable<  CoreSettingStudentCategory> list;
	private Iterable<  CoreSettingStudentCategory> listSelected;
	
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	
	public void refreshList() {
		this.bean = new CoreSettingStudentCategory();
		this.beanSelected = new CoreSettingStudentCategory();
		this.list = new ArrayList<CoreSettingStudentCategory>();
		this.listSelected = new ArrayList<CoreSettingStudentCategory>();
		try {
			list=coreSettingStudentCategoryService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getStudentCategoryName());
		try {
			if (bean != null) {
				coreSettingStudentCategoryService.create(bean);
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
				coreSettingStudentCategoryService.update(beanSelected);
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
				coreSettingStudentCategoryService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public CoreSettingStudentCategory getBean() {
		if(bean == null ) {
			bean=new CoreSettingStudentCategory();
		}
		return bean;
	}
	public void setBean(CoreSettingStudentCategory bean) {
		this.bean = bean;
	}
	public CoreSettingStudentCategory getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new CoreSettingStudentCategory();
		}
		return beanSelected;
	}

	public void setBeanSelected(CoreSettingStudentCategory beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<CoreSettingStudentCategory> getList() {
		list=coreSettingStudentCategoryService.findAll();
		return list;
	}

	public void setList(Iterable<CoreSettingStudentCategory> list) {
		this.list = list;
	}

	public Iterable<CoreSettingStudentCategory> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<CoreSettingStudentCategory> listSelected) {
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
