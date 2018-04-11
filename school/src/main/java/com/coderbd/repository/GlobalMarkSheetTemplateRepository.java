package com.coderbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderbd.entity.global.GlobalMarkSheetTemplate;

@Repository
public interface GlobalMarkSheetTemplateRepository extends JpaRepository<GlobalMarkSheetTemplate, Long>{
	public GlobalMarkSheetTemplate findByTemplateName(String templateName);
}
