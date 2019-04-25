package com.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.LifeCycle;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle.xml");
    	LifeCycle life=(LifeCycle) context.getBean("myBean");
        System.out.println(life.getMessage());
        
       ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
