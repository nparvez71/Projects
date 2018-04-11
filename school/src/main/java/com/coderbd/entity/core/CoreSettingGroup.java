package com.coderbd.entity.core;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "cs_group",uniqueConstraints= @UniqueConstraint(columnNames={"group_name", "institute_id"}))

public class CoreSettingGroup {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="pre_define_group_id")
	private String preDefineGroupID;

	@Column(name = "group_name")
	private String groupName;
	
	@Column(name="pre_define_status")
	private int preDefineStatus;
	
	@Column(name = "group_serial")
	private int groupSerial;
	
	@Column(name = "institute_id")
	private String instituteID;

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
	
	@Transient
	private boolean check;

	/*
	@OneToMany(cascade=CascadeType.DETACH,mappedBy="coreSettingsGroupobjgroupConfig",fetch=FetchType.EAGER)	
	private List<GroupConfig> groupConfigListgroup;*/
	
	
	/* Mapped CoreSetting group to Student Identification */
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "coreSettingCoreSettingGroup")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StdRegIdentification> groupStdRegIdentificationList;*/
	
	
	public CoreSettingGroup() {
		
	}
	
	

	/**
	 * @param groupID
	 * @param preDefineGroupID
	 * @param groupName
	 * @param preDefineStatus
	 * @param instituteID
	 * @param recordNote
	 * @param userExecuted
	 * @param dateExecuted
	 * @param ipExecuted
	 * @param recordStatus
	 */
	public CoreSettingGroup(String groupID, String preDefineGroupID, String groupName, int preDefineStatus,
			String instituteID, String recordNote, String userExecuted, Date dateExecuted, String ipExecuted,
			int recordStatus, int groupSerial) {
		
		
		this.preDefineGroupID = preDefineGroupID;
		this.groupName = groupName;
		this.preDefineStatus = preDefineStatus;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.groupSerial =groupSerial;
	}


	

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPreDefineGroupID() {
		return preDefineGroupID;
	}

	public void setPreDefineGroupID(String preDefineGroupID) {
		this.preDefineGroupID = preDefineGroupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
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




	public int getGroupSerial() {
		return groupSerial;
	}



	public void setGroupSerial(int groupSerial) {
		this.groupSerial = groupSerial;
	}



	public boolean isCheck() {
		return check;
	}



	public void setCheck(boolean check) {
		this.check = check;
	}
	
	
}
