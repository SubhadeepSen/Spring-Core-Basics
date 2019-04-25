package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.CustomerBo;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aspectApp.xml");
		CustomerBo cus = context.getBean("customer", CustomerBo.class);
		cus.addCustomer();
		cus.addCustomerReturnValue();
		// cus.addCustomerThrowException();
		cus.addCustomerAround("Subhadeep");
		((ClassPathXmlApplicationContext)context).close();
	}

}
