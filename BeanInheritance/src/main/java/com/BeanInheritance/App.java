package com.BeanInheritance;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("beanInheritance.xml");
        Student std=(Student) context.getBean("studentBean1");
        System.out.println(std.getName()+" "+std.getAge());
        
        std=(Student) context.getBean("studentBean2");
        System.out.println(std.getName()+" "+std.getAge()+" "+std.getAddress().getAddress());
    }
}
