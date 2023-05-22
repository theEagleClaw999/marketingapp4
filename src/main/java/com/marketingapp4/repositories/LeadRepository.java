package com.marketingapp4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp4.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
