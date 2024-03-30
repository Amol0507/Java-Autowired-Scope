package com.symbiosis.projectscopeautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Actor;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("s.xml");
    	Actor act=(Actor)context.getBean("ac");
        System.out.println( act);
       
    }
}
