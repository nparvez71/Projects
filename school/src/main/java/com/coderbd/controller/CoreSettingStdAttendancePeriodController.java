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

import com.coderbd.entity.core.CoreSettingShift;
import com.coderbd.entity.core.CoreSettingStdAttendancePeriod;
import com.coderbd.service.CoreSettingStdAttendancePeriodService;

@ManagedBean
@Component(value = "coreSettingStdAttendancePeriodMB")
@ViewScoped
public class CoreSettingStdAttendancePeriodController {
	@Autowired
	private   CoreSettingStdAttendancePeriodService  coreSettingStdAttendancePeriodService;
	private  CoreSettingStdAttendancePeriod bean;
	private  CoreSettingStdAttendancePeriod beanSelected;
	private Iterable< CoreSettingStdAttendancePeriod> list;
	private Iterable< CoreSettingStdAttendancePeriod> listSelected;
	
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new CoreSettingStdAttendancePeriod();
		this.beanSelected = new CoreSettingStdAttendancePeriod();
		this.list = new ArrayList<CoreSettingStdAttendancePeriod>();
		this.listSelected = new ArrayList<CoreSettingStdAttendancePeriod>();
		try {
			list=coreSettingStdAttendancePeriodService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getPredefineID());
		try {
			if (bean != null) {
				coreSettingStdAttendancePeriodService.create(bean);
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
				coreSettingStdAttendancePeriodService.update(beanSelected);
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
				coreSettingStdAttendancePeriodService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public CoreSettingStdAttendancePeriod getBean() {
		if(bean == null ) {
			bean=new CoreSettingStdAttendancePeriod();
		}
		return bean;
	}
	public void setBean(CoreSettingStdAttendancePeriod bean) {
		this.bean = bean;
	}
	public CoreSettingStdAttendancePeriod getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new CoreSettingStdAttendancePeriod();
		}
		return beanSelected;
	}

	public void setBeanSelected(CoreSettingStdAttendancePeriod beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<CoreSettingStdAttendancePeriod> getList() {
		list=coreSettingStdAttendancePeriodService.findAll();
		return list;
	}

	public void setList(Iterable<CoreSettingStdAttendancePeriod> list) {
		this.list = list;
	}

	public Iterable<CoreSettingStdAttendancePeriod> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<CoreSettingStdAttendancePeriod> listSelected) {
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
