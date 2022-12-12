package com.a77.repo;

import org.springframework.data.repository.CrudRepository;

import com.a77.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	
	
}
