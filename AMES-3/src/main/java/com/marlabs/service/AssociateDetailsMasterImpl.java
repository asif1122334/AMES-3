package com.marlabs.service;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.dao.AssociateDetailsRepo;
import com.marlabs.model.AssociateDetailsMaster;
@Service
public class AssociateDetailsMasterImpl implements AssociateDetailsService{

	@Autowired
	AssociateDetailsRepo associateRepo;
	@Override
	 
	public Collection<AssociateDetailsMaster> findAll() {
		 
		return (Collection<AssociateDetailsMaster>) associateRepo.findAll();
	}

	@Override
	public AssociateDetailsMaster findByID(String batchCode) {
		 
		return associateRepo.findById(batchCode).orElse(null);
		 
		 
	}

}
