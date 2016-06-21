package com.ryanorsinger.finances;
import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingsAccountTest
{

	@Test
	public void despositAndWithdrawal() {
		SavingsAccount account = new SavingsAccount();
		account.deposit(100);
		assertEquals("after deposit", 100, account.balance());
		account.withdraw(50);
		assertEquals("after withdrawal", 50, account.balance());
	}
	
	@Test
	public void negativeBalanceIsJustFine() {
		SavingsAccount account = new SavingsAccount();
		account.withdraw(75);
		assertEquals(-75, account.balance());
	}
	
	@Test
	public void nextYear() {
		SavingsAccount account = new SavingsAccount();
		account.deposit(10000);
		SavingsAccount nextYear = account.nextYear(10);
		assertEquals("$10,000 after a year with 10% interest", 11000, nextYear.balance());
	}
}
  