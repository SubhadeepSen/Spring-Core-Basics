package com.JDBC;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.dao.StudentDAO;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("jdbcApplication.xml");
    	StudentDAO dao=(StudentDAO) context.getBean("studentDao");
    	/*Student std=new Student(102,"Subha", 22, "purulia");
    	dao.addStudent(std);*/
    	
    	//dao.updateStudent(88, 102);

    	List<Student> stdList=dao.listStudent();
    	for(Student s:stdList)
    		System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getCity());
    }
}
