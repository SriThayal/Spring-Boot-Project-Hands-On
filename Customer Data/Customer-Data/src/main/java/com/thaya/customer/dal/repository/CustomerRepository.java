package com.thaya.customer.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.thaya.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
