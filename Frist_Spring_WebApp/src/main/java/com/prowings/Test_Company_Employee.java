package com.prowings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Company_Employee {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-beans.xml");
		Company company = context.getBean(Company.class, "Comp");
		System.out.println(company);

	}

}
