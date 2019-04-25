package com.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("constructorInjection.xml");
       // ApplicationContext context=new ClassPathXmlApplicationContext("setterInjection.xml");
        Student std=(Student) context.getBean("studentBean");
        System.out.println(std.getName()+" "+std.getAge()+" "+std.getCity());
    }
}
