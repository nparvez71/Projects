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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "g_card_template",uniqueConstraints= @UniqueConstraint(columnNames={"template_for_id","template_id"}))
public class GlobalCardTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "template_for")
	private String templateFor;
	
	@Column(name = "template_for_id")
	private String templateForID;

	@Column(name = "template_id")
	private String templateID;

	@Column(name = "template_name")
	private String templateName;
	
	@Column(name = "template_image")
	private String templateImage;
	
	@Column(name = "template_note")
	private String templateNote;

	@Column(name = "record_note")
	private String recordNote;

	@Column(name = "user_executed")
	private String userExecuted;

	@Column(name = "dateExecuted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;

	@Column(name = "ip_executed")
	private String ipExecuted;

	@Column(name = "recordStatus")
	private int recordStatus;

	public GlobalCardTemplate() {

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTemplateFor() {
		return templateFor;
	}

	public void setTemplateFor(String templateFor) {
		this.templateFor = templateFor;
	}

	public String getTemplateID() {
		return templateID;
	}

	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
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

	public String getTemplateForID() {
		return templateForID;
	}

	public void setTemplateForID(String templateForID) {
		this.templateForID = templateForID;
	}

	public String getTemplateImage() {
		return templateImage;
	}

	public void setTemplateImage(String templateImage) {
		this.templateImage = templateImage;
	}

	public String getTemplateNote() {
		return templateNote;
	}

	public void setTemplateNote(String templateNote) {
		this.templateNote = templateNote;
	}

}
