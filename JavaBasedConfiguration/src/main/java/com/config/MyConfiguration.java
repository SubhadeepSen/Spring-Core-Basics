package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Employee;

/*Annotating a class with the @Configuration indicates that the class can be 
used by the Spring IoC container as a source of bean definitions. 
The @Bean annotation tells Spring that a method annotated with @Bean 
will return an object that should be registered as a bean in the Spring 
application context.*/

@Configuration
//@Import(ConfigA.class) //we can also import Bean declaration in another Bean Declaration
public class MyConfiguration {

	@Bean
//@Bean(initMethod = "init", destroyMethod = "destroy" )
//@Scope("prototype")
	public Employee getEmployee(){
		return new Employee("Subhadeep", 27215.32);
	}
}
