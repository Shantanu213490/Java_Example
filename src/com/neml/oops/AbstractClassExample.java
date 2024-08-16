package com.neml.oops;

abstract class PaymentGateway {

	abstract int processPayment();

}

class CreditCardPayment extends PaymentGateway {

	int reqAmount;
	int availableBalance;

	public CreditCardPayment(int reqAmount, int availableBalance) {

		this.reqAmount = reqAmount;
		this.availableBalance = availableBalance;

	}

	@Override
	int processPayment() {
		return availableBalance - reqAmount;
	}

}

class PayPalPayment extends PaymentGateway {

	int reqAmount;
	int availableBalance;

	public PayPalPayment(int reqAmount, int availableBalance) {

		this.reqAmount = reqAmount;
		this.availableBalance = availableBalance;
	}

	@Override
	int processPayment() {
		return availableBalance - reqAmount;
	}

}

public class AbstractClassExample {

	public static void main(String[] args) {

		CreditCardPayment cardPayment = new CreditCardPayment(1000, 2000);
		PayPalPayment palPayment = new PayPalPayment(2000, 5000);
		
		int result1 = cardPayment.processPayment();
		System.out.println("Processing payment for CreditCardPayment : "+result1);
		
		int result2 = palPayment.processPayment();
		System.out.println("Processing payment for PayPalPayment : "+result2);
	}

}
//Question 4: Abstraction
//Write a Java program to demonstrate abstraction.
//Create an abstract class PaymentGateway with an abstract method processPayment().
//Create two concrete classes CreditCardPayment and PayPalPayment that inherit from PaymentGateway.
//Implement the processPayment() method in each concrete class to handle payment processing specific to that gateway.
