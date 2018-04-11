package com.coderbd.entity.core;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cs_subject", uniqueConstraints = @UniqueConstraint(columnNames = { "pre_define_id",
		"institute_id" }) )
public class InstituteSubject {

	@Id
	@Column(name = "subject_id")
	private String subjectID;

	@Column(name = "subject_name")
	private String subjectName;

	@Column(name = "pre_define_id")
	private String preDefineID;

	@Column(name = "pre_define_status")
	private int preDefineStatus;

	@Column(name = "subject_note")
	private String subjectNote;
	
	@Column(name = "subject_serial")
	private int subjectSerial;

	@Column(name = "institute_id")
	private String instituteID;

	@Column(name = "record_note")
	private String recordNote;

	@Column(name = "user_executed")
	private String userExecuted;

	@Column(name = "date_executed")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;

	@Column(name = "ip_executed")
	private String ipExecuted;

	@Column(name = "record_status")
	private int recordStatus;
	
	@Transient
	private boolean check;

	

	public InstituteSubject() {

	}


	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getPreDefineID() {
		return preDefineID;
	}

	public void setPreDefineID(String preDefineID) {
		this.preDefineID = preDefineID;
	}

	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
	}

	public String getSubjectNote() {
		return subjectNote;
	}

	public void setSubjectNote(String subjectNote) {
		this.subjectNote = subjectNote;
	}

	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
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

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getSubjectSerial() {
		return subjectSerial;
	}

	public void setSubjectSerial(int subjectSerial) {
		this.subjectSerial = subjectSerial;
	}

}
