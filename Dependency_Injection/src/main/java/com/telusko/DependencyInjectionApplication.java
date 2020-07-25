package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionApplication implements CommandLineRunner{
	
	@Autowired
	Samsung s7;
	
	public static void main(String[] args) 
	{
		
		// Defining application context using config class in different class file....
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();

	}

	@Override
	public void run(String... args) throws Exception
	{
		s7.config();
	}

}
