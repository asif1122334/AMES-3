package com.marlabs.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.marlabs.model.AssociateDetailsMaster;

public interface AssociateDetailsService {

	public abstract Collection<AssociateDetailsMaster> findAll();
	public AssociateDetailsMaster findByID(String batchCode);
}
