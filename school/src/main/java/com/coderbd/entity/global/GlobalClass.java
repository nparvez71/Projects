package com.coderbd.entity.global;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="g_class")
public class GlobalClass implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="predefine_class_id")
	private String predefineClassID;
	
	
	@Column(name="class_name",unique=true)
	private String className;
	
	@Column(name="class_note")
	private String classNote;
	
	@Column(name="predefine_status")
	private int predefineStatus;
	
	@Column(name="record_note")
	private String recordNote;
	
	@Column(name="user_executed")
	private String userExecuted;
	
	@Column(name="date_executed")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;
	
	@Column(name="ip_executed")
	private String ipExecuted;
	
	@Column(name="record_status")
	private int recordStatus;
	

	public GlobalClass() {
		super();
	}
	


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPredefineClassID() {
		return predefineClassID;
	}


	public void setPredefineClassID(String predefineClassID) {
		this.predefineClassID = predefineClassID;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getClassNote() {
		return classNote;
	}


	public void setClassNote(String classNote) {
		this.classNote = classNote;
	}


	public int getPredefineStatus() {
		return predefineStatus;
	}


	public void setPredefineStatus(int predefineStatus) {
		this.predefineStatus = predefineStatus;
	}


	public String getRecordNote() {
		return recordNote;
	}


	public void setRecordNote(String recordNote) {
		this.recordNote = recordNote;
	}


	public String getUserExecuted() {
		return userExecuted;
	}


	public void setUserExecuted(String userExecuted) {
		this.userExecuted = userExecuted;
	}


	public Date getDateExecuted() {
		return dateExecuted;
	}


	public void setDateExecuted(Date dateExecuted) {
		this.dateExecuted = dateExecuted;
	}


	public String getIpExecuted() {
		return ipExecuted;
	}


	public void setIpExecuted(String ipExecuted) {
		this.ipExecuted = ipExecuted;
	}


	public int getRecordStatus() {
		return recordStatus;
	}


	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}
	

	
}
