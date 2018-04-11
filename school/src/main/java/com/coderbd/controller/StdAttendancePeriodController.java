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
import com.coderbd.entity.global.StdAttendancePeriod;
import com.coderbd.service.StdAttendancePeriodService;


@ManagedBean
@Component(value = "stdAttendancePeriodMB")
@ViewScoped
public class StdAttendancePeriodController {

	@Autowired
	private StdAttendancePeriodService service;
	private StdAttendancePeriod bean;
	private StdAttendancePeriod beanSelected;
	private Iterable<StdAttendancePeriod> list;
	private Iterable<StdAttendancePeriod> listSelected;

	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new StdAttendancePeriod();
		this.beanSelected = new StdAttendancePeriod();
		this.list = new ArrayList<StdAttendancePeriod>();
		this.listSelected = new ArrayList<StdAttendancePeriod>();
		try {
			list=service.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String insert() {
		System.out.println("Sami............"+bean.getPeriodName());
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
	
	
	


	public StdAttendancePeriod getBean() {
		if(bean == null ) {
			bean=new StdAttendancePeriod();
		}
		return bean;
	}
	public void setBean(StdAttendancePeriod bean) {
		this.bean = bean;
	}
	public StdAttendancePeriod getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new StdAttendancePeriod();
		}
		return beanSelected;
	}

	public void setBeanSelected(StdAttendancePeriod beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<StdAttendancePeriod> getList() {
		list=service.findAll();
		return list;
	}

	public void setList(Iterable<StdAttendancePeriod> list) {
		this.list = list;
	}

	public Iterable<StdAttendancePeriod> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<StdAttendancePeriod> listSelected) {
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
