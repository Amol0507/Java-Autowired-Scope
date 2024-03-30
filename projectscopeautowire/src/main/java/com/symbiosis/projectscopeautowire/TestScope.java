package com.symbiosis.projectscopeautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Actor;

public class TestScope {

	public static void main(String[] args) {
		

		ApplicationContext context=new ClassPathXmlApplicationContext("s.xml");
    	Actor a1=(Actor)context.getBean("ac");
        System.out.println(a1);
        
        a1.setId(101);
        a1.setName("Vijay");
        System.out.println(a1);
        
        Actor a2=(Actor)context.getBean("ac");
	}

}
