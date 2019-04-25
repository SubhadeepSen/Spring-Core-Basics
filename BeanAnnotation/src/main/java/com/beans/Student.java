package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/*The @Autowired annotation can apply to bean property setter methods, 
non-setter methods, constructor and properties.*/

//The @Required annotation applies to bean property setter methods.

/*The @Qualifier annotation along with @Autowired can be used to remove 
the confusion by specifiying which exact bean will be wired.*/

public class Student {
	private String name;
	private int age;
	//@Autowired
	private Address address;
	
	public Student() {
		
	}
	
	public Student(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	@Required
	@Qualifier("address2")		//address	<------>	address2 change it
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
