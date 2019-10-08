package com.wxr.service;

import java.util.List;

import com.wxr.domain.Customer;

public interface ICustomerService {

	List<Customer> findAllCustomer();

	void saveCustomer(Customer customer);
}
