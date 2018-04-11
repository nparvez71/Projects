package com.coderbd.entity.core;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cs_class_config",uniqueConstraints= @UniqueConstraint(columnNames={"class_id","shift_id","section_id", "institute_id"}))
public class CoreSettingClassConfig {
   
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "institute_id")
	private String instituteID;

	@Column(name = "class_config_serial")
	private String classConfigSerial;

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
	
	
	
	@ManyToOne
	@JoinColumn(name="class_id")
	private CoreSettingsClass coreSettingsClassobj;
	
	@ManyToOne
	@JoinColumn(name="shift_id")
	private CoreSettingShift coreSettingShiftobj;
	
	@ManyToOne
	@JoinColumn(name="section_id")
	private CoreSettingSection coreSettingSectionobj;
	
	@Transient
	private int totalStdnInSection;
	
	

	public CoreSettingsClass getCoreSettingsClassobj() {
		
		if (this.coreSettingsClassobj==null) {
			this.coreSettingsClassobj = new CoreSettingsClass();
		}
		return coreSettingsClassobj;
	}

	public void setCoreSettingsClassobj(CoreSettingsClass coreSettingsClassobj) {
		this.coreSettingsClassobj = coreSettingsClassobj;
	}
	


	public CoreSettingShift getCoreSettingShiftobj() {
		
		if (this.coreSettingShiftobj==null) {
			this.coreSettingShiftobj = new CoreSettingShift();
		}
		return coreSettingShiftobj;
	}

	public void setCoreSettingShiftobj(CoreSettingShift coreSettingShiftobj) {
		this.coreSettingShiftobj = coreSettingShiftobj;
	}

	public CoreSettingSection getCoreSettingSectionobj() {
		
		if (this.coreSettingSectionobj==null) {
			this.coreSettingSectionobj = new CoreSettingSection();
		}
		return coreSettingSectionobj;
	}

	public void setCoreSettingSectionobj(CoreSettingSection coreSettingSectionobj) {
		this.coreSettingSectionobj = coreSettingSectionobj;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
	}

	public String getClassConfigSerial() {
		return classConfigSerial;
	}

	public void setClassConfigSerial(String classConfigSerial) {
		this.classConfigSerial = classConfigSerial;
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

	public int getTotalStdnInSection() {
		return totalStdnInSection;
	}

	public void setTotalStdnInSection(int totalStdnInSection) {
		this.totalStdnInSection = totalStdnInSection;
	}
	
	

}
