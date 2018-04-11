package com.coderbd.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderbd.entity.global.GlobalShift;
/**
 * 
 * @author Rajaul Islam
 *
 */

@Repository
public interface GlobalShiftRepository extends JpaRepository<GlobalShift, Long> {
	
    
}
