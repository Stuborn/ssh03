package com.wxr.dao;

import java.util.List;

import com.wxr.domain.Customer;

public interface ICustomerDao {

	List<Customer> findAllCustomer();

	void saveCustomer(Customer customer);

}
