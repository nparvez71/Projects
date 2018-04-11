package com.coderbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.coderbd.entity.global.GlobalSubject;

@Repository
public interface SubjectRepository extends JpaRepository<GlobalSubject, Long> {
	public GlobalSubject findBySubjectName(String subjectName);
}
