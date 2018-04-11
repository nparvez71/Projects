package com.coderbd.entity.core;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "cs_shift",uniqueConstraints= @UniqueConstraint(columnNames={"shift_name", "institute_id"}))
public class CoreSettingShift {

	@Id
	@Column(name = "shift_id")
	private String shiftID;

	@Column(name = "shift_name")
	private String shiftName;
	
	@Column(name = "predefine_id")
	private String predefineID;
	
	@Column(name = "predefine_status")
	private int predefineStatus;
	
	@Column(name = "shift_serial")
	private int shiftSerial;

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

	
	public CoreSettingShift() {
		
	}
	
	

	public CoreSettingShift(String shiftID, String shiftName, String predefineID, int predefineStatus,
			String instituteID, String recordNote, String userExecuted, Date dateExecuted, String ipExecuted,
			int recordStatus,int shiftSerial) {
		super();
		this.shiftID = shiftID;
		this.shiftName = shiftName;
		this.predefineID = predefineID;
		this.predefineStatus = predefineStatus;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.shiftSerial = shiftSerial;
	}


	



	public String getShiftID() {
		return shiftID;
	}

	public void setShiftID(String shiftID) {
		this.shiftID = shiftID;
	}

	public String getShiftName() {
		return shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public String getPredefineID() {
		return predefineID;
	}

	public void setPredefineID(String predefineID) {
		this.predefineID = predefineID;
	}

	public int getPredefineStatus() {
		return predefineStatus;
	}

	public void setPredefineStatus(int predefineStatus) {
		this.predefineStatus = predefineStatus;
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



	public int getShiftSerial() {
		return shiftSerial;
	}



	public void setShiftSerial(int shiftSerial) {
		this.shiftSerial = shiftSerial;
	}


	
	
	
}
