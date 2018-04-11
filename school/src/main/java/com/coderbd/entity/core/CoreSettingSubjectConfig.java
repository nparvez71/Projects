package com.coderbd.entity.core;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "cs_subject_config", uniqueConstraints = @UniqueConstraint(columnNames = { "subject_id", "class_id",
		"group_id", "institute_id" }) )
public class CoreSettingSubjectConfig {

	@Id
	@Column(name = "subject_config_id")
	private String subjectConfigID;

	@Column(name = "institute_id")
	private String instituteID;

	@Column(name = "subject_serial")
	private int subjectSerial;

	@Column(name = "subject_status")
	private int subjectStatus;

	@Column(name = "subject_code")
	private String subjectCode;

	@Column(name = "subject_predefine_id")
	private String subjectPredefineID;

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

	@ManyToOne
	@JoinColumn(name = "subject_id")
	private InstituteSubject instituteSubjectObj;

	@ManyToOne
	@JoinColumn(name = "class_id")
	private CoreSettingsClass coreSettingsClassObj;

	@ManyToOne
	@JoinColumn(name = "group_id")
	private CoreSettingGroup coreSettingGroupObj;

	public CoreSettingSubjectConfig() {

	}

	
	public String getSubjectConfigID() {
		return subjectConfigID;
	}

	public void setSubjectConfigID(String subjectConfigID) {
		this.subjectConfigID = subjectConfigID;
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

	public InstituteSubject getInstituteSubjectObj() {
		return instituteSubjectObj;
	}

	public void setInstituteSubjectObj(InstituteSubject instituteSubjectObj) {
		this.instituteSubjectObj = instituteSubjectObj;
	}

	public int getSubjectSerial() {
		return subjectSerial;
	}

	public void setSubjectSerial(int subjectSerial) {
		this.subjectSerial = subjectSerial;
	}

	public CoreSettingsClass getCoreSettingsClassObj() {
		return coreSettingsClassObj;
	}

	public void setCoreSettingsClassObj(CoreSettingsClass coreSettingsClassObj) {
		this.coreSettingsClassObj = coreSettingsClassObj;
	}

	public CoreSettingGroup getCoreSettingGroupObj() {
		return coreSettingGroupObj;
	}

	public void setCoreSettingGroupObj(CoreSettingGroup coreSettingGroupObj) {
		this.coreSettingGroupObj = coreSettingGroupObj;
	}

	public int getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(int subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectPredefineID() {
		return subjectPredefineID;
	}

	public void setSubjectPredefineID(String subjectPredefineID) {
		this.subjectPredefineID = subjectPredefineID;
	}

}
