package com.BeanAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beanAutowiring.xml");
        Student std=(Student) context.getBean("studentBean");
        System.out.println(std.getAddress().getAddress());
    }
}
