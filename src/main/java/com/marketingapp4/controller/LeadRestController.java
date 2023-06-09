package com.marketingapp4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp4.entities.Lead;
import com.marketingapp4.repositories.LeadRepository;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	private LeadRepository leadRepo;
	
	//CRUD operation API to be developed
	
	//localhost:8080/api/leads
	
	//retrieving 'or' reading
	@GetMapping
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadRepo.findAll();
		return leads; 
	}
	
	//creating 'or' saving 
	@PostMapping
	public void saveOneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	
	//updating a record
	@PutMapping
	public void updateOneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	
	//deleting a record
	//localhost:8080/api/leads/4
	@DeleteMapping("/{id}")
	public void deleteOneLead(@PathVariable("id") long id) {
		leadRepo.deleteById(id);
	}
	
	//localhost:8080/api/leads/5
	@GetMapping("/{id}")
	public Lead getOneLead(@PathVariable("id") long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
}
