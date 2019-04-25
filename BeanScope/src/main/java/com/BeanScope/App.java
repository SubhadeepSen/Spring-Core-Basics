package com.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Hello;

/*Scope				Description
------------------------------------
singleton			This scopes the bean definition to a single instance per Spring IoC container (default).
prototype			This scopes a single bean definition to have any number of object instances.
request				This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
session				This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
global-session		This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.*/


public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beanScope.xml");
//Checking Singleton....only one object instance is created...
//This scopes the bean definition to a single instance per Spring IoC container
		/*Hello h1=(Hello) context.getBean("helloSingleton");
		h1.setMessage("This is singleton");
		System.out.println(h1.getMessage());

		Hello h2=(Hello) context.getBean("helloSingleton");
		System.out.println(h2.getMessage());*/

//Checking prototype....multiple object instance is created...
//This scopes a single bean definition to have any number of object instances
		Hello h1=(Hello) context.getBean("helloPrototype");
		h1.setMessage("This is singleton");
		System.out.println(h1.getMessage());

		Hello h2=(Hello) context.getBean("helloPrototype");
		System.out.println(h2.getMessage());
	}
}
