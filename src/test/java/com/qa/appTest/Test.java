package com.qa.appTest;

import static org.junit.Assert.*;

import com.qa.app.Account;
import com.qa.app.Service;

public class Test {

	
	
	Account account1;
	Account account2;
	Account fail;
	Service test;
	
	@org.junit.Before
	public void setup() {
		account1 = new Account("first", "last", "accountnum");
		account2 = new Account("Michael", "Massey", "0123456");
		fail = new Account("fail", "fail", "1234567");
		test = new Service();
	}
	
	@org.junit.Test
	public void addAccountTest() {
		assertEquals("Account added.", test.addAccount(1, account1));
		assertEquals("Account added.", test.addAccount(2, account2));
		assertEquals("This key is already taken. Choose a new key.", test.addAccount(2, fail));
		assertEquals(true, test.getAccountMap().size() == 2);
	}
	
	@org.junit.Test
	public void getAccountTest() {
		test.addAccount(1, account1);
		test.addAccount(2, account2);
		assertEquals("First Name: " + account1.getFirstName() + " Last Name: " + account1.getLastName() + " Account Number: " + account1.getAccountNumber(), test.getAccount(1));
		assertEquals("First Name: " + account2.getFirstName() + " Last Name: " + account2.getLastName() + " Account Number: " + account2.getAccountNumber(), test.getAccount(2));
	}
	
	@org.junit.Test
	public void removeAccountTest() {
		test.addAccount(1, account1);
		test.addAccount(2, account2);
		assertEquals("Account removed", test.removeAccount(1));
		assertEquals("This account does not exist.", test.removeAccount(4));
		assertEquals(true, test.getAccountMap().size() == 1);
	}

}
