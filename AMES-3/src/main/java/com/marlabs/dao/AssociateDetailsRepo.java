package com.marlabs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.model.AssociateDetailsMaster;
@Repository
public interface AssociateDetailsRepo extends CrudRepository<AssociateDetailsMaster, String> {

}
