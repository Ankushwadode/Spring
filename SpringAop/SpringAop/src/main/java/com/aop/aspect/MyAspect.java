package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printbefore() {
//		authentication can be done here...
		System.out.println("payment started.....");
	}
	
	@After("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printafter() {
//		authentication can be done here...
		System.out.println("payment done.....");
	}
}
