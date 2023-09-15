package com.thaya.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thaya.customer.dal.entities.Customer;
import com.thaya.customer.dal.repository.CustomerRepository;

@SpringBootTest
class CustomerDataApplicationTests {

	@Autowired
	private CustomerRepository repo;
	
	@Test
	void testCreateCustomer() {
		
		Customer customer = new Customer();
		customer.setName("Thaya");
		customer.setEmail("thayalaraj@gmail.com");
		repo.save(customer);
	}
	
	@Test
	void testFindCustomer() {
		
		Customer customer = repo.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	void testUpdateCustomer() {
		
		Customer customer = repo.findById(1l).get();
		customer.setEmail("thaya@gmail.com");
		repo.save(customer);
		
	}
	
	@Test
	void testDeleteCustomer() {
		
		repo.deleteById(1l);
	}
	
}
