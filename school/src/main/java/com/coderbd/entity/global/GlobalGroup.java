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
@Table(name = "g_group")
public class GlobalGroup {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "predefine_group_id")
	private String predefineGroupID;

	@Column(name = "group_name",unique=true)
	private String groupName;

	@Column(name = "predefine_status")
	private int predefineStatus;

	@Column(name = "group_note")
	private String groupNote;

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

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPredefineGroupID() {
		return predefineGroupID;
	}

	public void setPredefineGroupID(String predefineGroupID) {
		this.predefineGroupID = predefineGroupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getPredefineStatus() {
		return predefineStatus;
	}

	public void setPredefineStatus(int predefineStatus) {
		this.predefineStatus = predefineStatus;
	}

	public String getGroupNote() {
		return groupNote;
	}

	public void setGroupNote(String groupNote) {
		this.groupNote = groupNote;
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
