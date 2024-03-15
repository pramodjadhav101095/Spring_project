package com.prowings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Student {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		
	Student s   =context.getBean(Student.class, "std");
	System.out.println(s);
		
	}

}
