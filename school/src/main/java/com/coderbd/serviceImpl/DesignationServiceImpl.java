package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.coderbd.entity.global.GlobalDesignation; 
import com.coderbd.repository.DesignationRepository;  
import com.coderbd.service.DesignationService; 

@Service("DesignationService")
@Repository
@Transactional
public class DesignationServiceImpl implements DesignationService {
	final static Logger logger = LoggerFactory.getLogger(DesignationServiceImpl.class);

	@Autowired
	private DesignationRepository designationRepository;

	@Override
	public void create(GlobalDesignation globalDesignation) {
		designationRepository.saveAndFlush(globalDesignation);
		
	}

	@Override
	public void update(GlobalDesignation globalDesignation) {
		designationRepository.saveAndFlush(globalDesignation);
	}

	@Override
	public void delete(GlobalDesignation globalDesignation) {
		designationRepository.delete(globalDesignation);
		
	}

	@Override
	public Iterable<GlobalDesignation> findAll() {
		// TODO Auto-generated method stub
		return designationRepository.findAll();
	}

	@Override
	public GlobalDesignation findByDesignationName(String designationName) {
		return designationRepository.findByDesignationName(designationName);
	}

}
