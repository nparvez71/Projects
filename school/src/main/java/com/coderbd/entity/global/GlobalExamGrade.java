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
@Table(name="g_exam_grade")
public class GlobalExamGrade {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="exam_grade_name", unique=true)
	private String examGradeName;
	
	@Column (name="pre_define_id")
	private String preDefineID;
	
	@Column (name="pre_define_status")
	private int preDefineStatus;
	
	@Column(name="grade_range")
	private String gradeRange;
	
	@Column(name="grade_number")
	private double gradeNumber;
	
	@Column(name="number_low")
	private double numberLow;
	
	@Column(name="number_high")
	private double numberHigh;
	
	@Column(name="grade_point")
	private double gradePoint;
	
	@Column(name="point_low")
	private double pointLow;
	
	@Column(name="point_high")
	private double pointHigh;
	
	
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

	
	
	
	
	
	public GlobalExamGrade() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getExamGradeName() {
		return examGradeName;
	}

	public void setExamGradeName(String examGradeName) {
		this.examGradeName = examGradeName;
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

	public String getGradeRange() {
		return gradeRange;
	}

	public void setGradeRange(String gradeRange) {
		this.gradeRange = gradeRange;
	}

	public double getGradeNumber() {
		return gradeNumber;
	}

	public void setGradeNumber(double gradeNumber) {
		this.gradeNumber = gradeNumber;
	}

	public double getNumberLow() {
		return numberLow;
	}

	public void setNumberLow(double numberLow) {
		this.numberLow = numberLow;
	}

	public double getNumberHigh() {
		return numberHigh;
	}

	public void setNumberHigh(double numberHigh) {
		this.numberHigh = numberHigh;
	}

	public double getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(double gradePoint) {
		this.gradePoint = gradePoint;
	}

	public double getPointLow() {
		return pointLow;
	}

	public void setPointLow(double pointLow) {
		this.pointLow = pointLow;
	}

	public double getPointHigh() {
		return pointHigh;
	}

	public void setPointHigh(double pointHigh) {
		this.pointHigh = pointHigh;
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
