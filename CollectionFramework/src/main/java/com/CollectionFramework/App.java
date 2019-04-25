package com.CollectionFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.MyCollection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("myCollection.xml");
    	MyCollection col=(MyCollection) context.getBean("collectionTest");
        col.displayList();
        col.displaySet();
        col.displayMap();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
