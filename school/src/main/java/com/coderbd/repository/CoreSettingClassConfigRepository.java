package com.coderbd.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderbd.entity.core.CoreSettingClassConfig;

/**
 * 
 * @author Rajaul Islam
 *
 */

@Repository
public interface CoreSettingClassConfigRepository extends JpaRepository<CoreSettingClassConfig, Long> {
	
}
