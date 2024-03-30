package com.symbiosis.projectscopeautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Laptop;

public class TestAutowired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiried.xml");
		Laptop a=(Laptop)context.getBean("lap");
		System.out.println(a);
	}

}
