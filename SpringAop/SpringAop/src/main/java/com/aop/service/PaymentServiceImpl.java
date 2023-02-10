package com.aop.service;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amt) {
		// TODO Auto-generated method stub
		//payment code....
		System.out.println(amt+" Amount Debited...");
		
//		some process here
		
		System.out.println(amt+" Amount Credited...");
	}
}
