package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.accessingdatajpa.Customer;
import com.example.demo.accessingdatajpa.CustomerRepository;

@RestController // Controller + ResponseBody
public class CustomerController {

	@Autowired
	CustomerRepository repo;

	@GetMapping("/customer")
	public Iterable<Customer> findall() {
		return repo.findAll();
	}

	@GetMapping("/")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("greet", "<b>안녕</b>하세요");
		return mv;

	}
}
