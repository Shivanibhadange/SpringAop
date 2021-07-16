package com.fis.app.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.ElectronicDevice;
import com.fis.app.model.Client;
import com.fis.app.service.ClientService;

public class MainRunner {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("Spring-conf.xml");
		
		
		
		ClientService clientService = (ClientService)spring.getBean("clientService");
		
		System.out.println(" \n\n------------New AOP Approach --------- \n\n");
		clientService.doSwitchOn();
		
		System.out.println(" \n\n--------- No Argument call ---------\n\n");
		clientService.doSwitchOff();
		
	
		
		
	
		
	}
}
