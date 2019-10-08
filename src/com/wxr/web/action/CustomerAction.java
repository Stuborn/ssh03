package com.wxr.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wxr.domain.Customer;
import com.wxr.service.ICustomerService;

@ParentPackage("struts-default")
@Namespace("/customer")
@Results({
		@Result(name="addUICustomer",type="dispatcher",location="/jsp/customer/add.jsp"),
		@Result(name="findAllCustomer",type="dispatcher",location="/jsp/customer/list.jsp")
})
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer = new Customer();
	private List<Customer> customers;
	private ICustomerService customerService;

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}

	@Override
	public Customer getModel() {
		return customer;
	}
	
	@Action("findAllCustomer")
	public String findAllCustomer() {
		customers = customerService.findAllCustomer();
		return "findAllCustomer";
	}
	
	@Action("addUICustomer")
	public String addUICustomer() {
		return "addUICustomer";
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
	
}
