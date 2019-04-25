package com.DependencyInjection;

import org.junit.Assert;
import org.junit.Test;

import com.bean.Student;

public class AppTest
{
	Student std=new Student("Sunny",24,"Kolkata");
	
	
	@Test
    public void testApp()
    {
		Assert.assertEquals(std.getAge(), 24);
    }
}
