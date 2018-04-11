package com.coderbd.entity.global;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="g_designation")
public class GlobalDesignation implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="designation_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long designationID;
	
	@Column(name="designation_name",unique=true)
	private String designationName;
	
	@Column (name="predefine_id")
	private String preDefineID;
	
	@Column(name="designation_note")
	private String designationNote;
	

	public GlobalDesignation() {
		super();
	}



	public long getDesignationID() {
		return designationID;
	}

	public void setDesignationID(long designationID) {
		this.designationID = designationID;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	
	

	public String getPreDefineID() {
		return preDefineID;
	}



	public void setPreDefineID(String preDefineID) {
		this.preDefineID = preDefineID;
	}


	public String getDesignationNote() {
		return designationNote;
	}

	public void setDesignationNote(String designationNote) {
		this.designationNote = designationNote;
	}

}
