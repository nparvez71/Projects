package com.coderbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderbd.entity.global.GlobalClass;
import com.coderbd.entity.global.GlobalGroup;

public interface GlobalGroupRepository extends JpaRepository<GlobalGroup, Long> {

}
