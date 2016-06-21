package com.ryanorsinger.finances;
import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingsAccountYearTest
{

	@Test
	public void despositAndWithdrawal() {
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(100);
		assertEquals("after deposit", 100, account.balance());
		account.withdraw(50);
		assertEquals("after withdrawal", 50, account.balance());
	}
	
	@Test
	public void negativeBalanceIsJustFine() {
		SavingsAccountYear account = new SavingsAccountYear();
		account.withdraw(75);
		assertEquals(-75, account.balance());
	}
	
	@Test
	public void nextYear() {
		SavingsAccountYear account = new SavingsAccountYear();
		account.deposit(10000);
		SavingsAccountYear nextYear = account.nextYear(10);
		assertEquals("$10,000 after a year with 10% interest", 11000, nextYear.balance());
	}
	
	@Test
	public void endingBalance() {
		SavingsAccountYear account = new SavingsAccountYear(10000, 10);
		assertEquals(11000, account.endingBalance());
	}
}
  