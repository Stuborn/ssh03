package com.wxr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxr.dao.ICustomerDao;
import com.wxr.service.ICustomerService;

public class Test01Spring {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		ICustomerService customerService = (ICustomerService) ac.getBean("customerService");
		ICustomerDao customerDao = (ICustomerDao) ac.getBean("customerDao");
		System.out.println(ac);
		System.out.println(customerService);
		System.out.println(customerDao);
		System.out.println("------------------------");
		System.out.println(ac.getBean("customerService"));
		System.out.println(ac.getBean("customerDao"));
		System.out.println("------------------------");
		customerService.findAllCustomer();
	}
}
