package com.coderbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.coderbd.entity.global.GlobalDesignation;

@Repository
public interface DesignationRepository extends JpaRepository<GlobalDesignation, Long> {
	public GlobalDesignation findByDesignationName(String designationName);
}
