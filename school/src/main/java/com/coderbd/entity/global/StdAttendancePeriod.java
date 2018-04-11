package com.coderbd.entity.global;

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
@Table (name="g_std_attendance_period")
public class StdAttendancePeriod {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="predefine_id")
	private String predefineID;
	
	@Column(name="period_name", unique=true)
	private String periodName;
	
	
	@Column(name="period_note")
	private String periodNote;
	
	@Column(name="predefine_status")
	private String predefineStatus;
	
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

	
	
	public StdAttendancePeriod() {
	
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	public String getPeriodNote() {
		return periodNote;
	}

	public void setPeriodNote(String periodNote) {
		this.periodNote = periodNote;
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

	public String getPredefineID() {
		return predefineID;
	}

	public void setPredefineID(String predefineID) {
		this.predefineID = predefineID;
	}

	public String getPredefineStatus() {
		return predefineStatus;
	}

	public void setPredefineStatus(String predefineStatus) {
		this.predefineStatus = predefineStatus;
	}
	
	
}
