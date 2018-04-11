package com.coderbd.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderbd.entity.global.StdAttendancePeriod;
/**
 * 
 * @author Rajaul Islam
 *
 */

@Repository
public interface StdAttendancePeriodRepository extends JpaRepository<StdAttendancePeriod, Long> {
	
    
}
