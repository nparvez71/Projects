package com.coderbd.entity.global;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="g_subject")
public class GlobalSubject {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="subject_name", unique=true)
	private String subjectName;
	
	@Column (name="pre_define_id")
	private String preDefineID;
	
	@Column(name="subject_note")
	private String subjectNote;

	public GlobalSubject() {
		super();
	}
	


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	

	public String getPreDefineID() {
		return preDefineID;
	}


	public void setPreDefineID(String preDefineID) {
		this.preDefineID = preDefineID;
	}

	public String getSubjectNote() {
		return subjectNote;
	}

	public void setSubjectNote(String subjectNote) {
		this.subjectNote = subjectNote;
	}

	
	

}
