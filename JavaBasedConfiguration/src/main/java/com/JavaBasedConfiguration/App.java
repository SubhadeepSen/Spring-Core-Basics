package com.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Employee;
import com.config.MyConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
       Employee emp=(Employee) context.getBean(Employee.class);
       System.out.println(emp.getEmployeeName()+" "+emp.getSalary());
    }
}
