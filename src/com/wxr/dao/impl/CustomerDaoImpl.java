package com.wxr.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wxr.dao.ICustomerDao;
import com.wxr.domain.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements ICustomerDao {
	
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Customer> findAllCustomer() {
		return (List<Customer>) hibernateTemplate.find("from Customer");
	}

	@Override
	public void saveCustomer(Customer customer) {
		hibernateTemplate.save(customer);
	}

}
