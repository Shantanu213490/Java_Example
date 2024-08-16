package com.neml.oops;

class BankAccount{
	
	private String accountNumber;
	private String balance;
	private String ownerName;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}
public class EncapsulationExample {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber("1234335");
		bankAccount.setBalance("500000");
		bankAccount.setOwnerName("Sams MckGirk");
		
		System.out.println("Name : "+bankAccount.getOwnerName().toString()+ ", Account Number : "+bankAccount.getAccountNumber().toString()+ ", Balance : "+bankAccount.getBalance().toString());

	}

}
//Question 3: Create a Java program to demonstrate the concept of encapsulation.
//Define a class BankAccount with private fields for account number, balance, and owner name.
//Provide public methods to deposit, withdraw, and check balance.