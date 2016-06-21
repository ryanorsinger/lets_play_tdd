package com.ryanorsinger.finances;

public class SavingsAccountYear {
	
	private int balance = 0;
	
	public SavingsAccountYear() {}
	
	public SavingsAccountYear(int startingBalance, int interestRate) {
	
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int balance() {
		return balance;
	}
 
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public SavingsAccountYear nextYear(int interestRate) {
		SavingsAccountYear result = new SavingsAccountYear();
		result.deposit(balance() + (balance() * interestRate / 100));
		return result;
	}
}
 