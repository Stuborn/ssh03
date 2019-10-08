package com.wxr.test;

import java.util.List;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxr.domain.Customer;
import com.wxr.service.ICustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:bean.xml"})
public class Test03SpringHibernate {

	@Autowired
	private ICustomerService cs;
	
	@Test
	public void testSave() {
		Customer c = new Customer();
		c.setCustId("05");
		c.setCustName("spring hibernate3");
		cs.saveCustomer(c);
	}
	
	@Test
	public void testFindAllCustomer() {
		List<Customer> list = cs.findAllCustomer();
		System.out.println(list);
		List<Customer> list2 = cs.findAllCustomer();
		System.out.println(list2);
	}
}
