package com.zoho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {
	
}


//Repository layer help us to perform CRUD operation because it uses lots
// of builting method like findById(), findAll(),deleteById()