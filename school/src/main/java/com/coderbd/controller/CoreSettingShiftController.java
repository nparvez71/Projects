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
import com.coderbd.service.CoreSettingShiftService;

@ManagedBean
@Component(value = "coreSettingShiftMB")
@ViewScoped
public class CoreSettingShiftController {
	@Autowired
	private  CoreSettingShiftService  coreSettingShiftService;
	private  CoreSettingShift bean;
	private  CoreSettingShift beanSelected;
	private Iterable< CoreSettingShift> list;
	private Iterable< CoreSettingShift> listSelected;
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new CoreSettingShift();
		this.beanSelected = new CoreSettingShift();
		this.list = new ArrayList<CoreSettingShift>();
		this.listSelected = new ArrayList<CoreSettingShift>();
		try {
			list=coreSettingShiftService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getShiftName());
		try {
			if (bean != null) {
				coreSettingShiftService.create(bean);
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
				coreSettingShiftService.update(beanSelected);
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
				coreSettingShiftService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public CoreSettingShift getBean() {
		if(bean == null ) {
			bean=new CoreSettingShift();
		}
		return bean;
	}
	public void setBean(CoreSettingShift bean) {
		this.bean = bean;
	}
	public CoreSettingShift getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new CoreSettingShift();
		}
		return beanSelected;
	}

	public void setBeanSelected(CoreSettingShift beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<CoreSettingShift> getList() {
		list=coreSettingShiftService.findAll();
		return list;
	}

	public void setList(Iterable<CoreSettingShift> list) {
		this.list = list;
	}

	public Iterable<CoreSettingShift> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<CoreSettingShift> listSelected) {
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
