package com.coderbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderbd.entity.global.GlobalClass;
import com.coderbd.entity.global.GlobalSection;

@Repository
public interface GlobalSectionRepository  extends JpaRepository<GlobalSection, Long>  {

}
