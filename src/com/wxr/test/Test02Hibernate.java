package com.wxr.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wxr.domain.Customer;

public class Test02Hibernate {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustId("id2");
		c.setAddress("shanghai2");
		c.setCustName("test02");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
//		session.close();
		sf.close();
	}
}
