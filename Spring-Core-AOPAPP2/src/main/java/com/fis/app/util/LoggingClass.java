package com.fis.app.util;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingClass {

	@After("execution(public void com.fis.app.service.ClientService.doSwitchOff())")
	public void doLogging()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("[INFO] do Logging 1 -> "+dateTime);
	}
	
	@After("execution(public * do*())")
	public void doLogging_noArgMethods()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("[INFO] Do Logging NoArg -> "+dateTime);
	}
	
}
