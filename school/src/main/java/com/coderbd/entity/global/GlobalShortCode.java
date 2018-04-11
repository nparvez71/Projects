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
@Table(name="g_short_code")
public class GlobalShortCode {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="short_code_title", unique=true)
	private String shortCodeTitle;
	
	@Column(name="pre_define_id")
	private int preDefineID;
	
	@Column(name="pre_define_status")
	private int preDefineStatus;
	
	@Column(name="total_mark")
	private double totalMark;
	
	@Column(name="pass_mark")
	private double passMark;
	
	@Column(name="accept_percent")
	private double acceptPercent;
	
	@Column(name="short_codeNote")
	private String shortCodeNote;
	
	
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
	
	
	
	
	

	public GlobalShortCode() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getShortCodeTitle() {
		return shortCodeTitle;
	}

	public void setShortCodeTitle(String shortCodeTitle) {
		this.shortCodeTitle = shortCodeTitle;
	}
	
	
	

	

	public int getPreDefineID() {
		return preDefineID;
	}

	public void setPreDefineID(int preDefineID) {
		this.preDefineID = preDefineID;
	}

	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
	}

	public double getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(double totalMark) {
		this.totalMark = totalMark;
	}

	public double getPassMark() {
		return passMark;
	}

	public void setPassMark(double passMark) {
		this.passMark = passMark;
	}

	public double getAcceptPercent() {
		return acceptPercent;
	}

	public void setAcceptPercent(double acceptPercent) {
		this.acceptPercent = acceptPercent;
	}

	public String getShortCodeNote() {
		return shortCodeNote;
	}

	public void setShortCodeNote(String shortCodeNote) {
		this.shortCodeNote = shortCodeNote;
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
