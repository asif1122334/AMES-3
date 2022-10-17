package com.marlabs.controller;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.marlabs.model.AssociateDetailsMaster;
import com.marlabs.service.AssociateDetailsMasterImpl;

@Controller
public class AssociateDetailsMasterController {

	@Autowired
	AssociateDetailsMasterImpl associateService;
	 
@GetMapping(value="/findAll" )
public String findAll(Map<String,Object> map ) {
	map.put("find", associateService.findAll());
	
	
	return "findAll";
}

          @GetMapping(value="/id/{batchCode}")
          public String getById(@PathVariable String batchCode,Map<String,Object> map) {
        	   AssociateDetailsMaster aId = associateService.findByID(batchCode);
        	   map.put("a",aId );
        	  return "findByID";
          }

}
