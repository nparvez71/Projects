package com.coderbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderbd.entity.global.GlobalAcademicYear;




@Repository
public interface GlobalAcademicYearRepository extends JpaRepository<GlobalAcademicYear, Long>{
	
	
}
