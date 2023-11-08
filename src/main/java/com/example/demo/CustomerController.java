package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.accessingdatajpa.Customer;
import com.example.demo.accessingdatajpa.CustomerRepository;

@RestController //Controller + ResponseBody
public class CustomerController {
	
	@Autowired CustomerRepository repo;

	@GetMapping("/customer")
	public Iterable<Customer> findall(){
		return repo.findAll();
	}
}
