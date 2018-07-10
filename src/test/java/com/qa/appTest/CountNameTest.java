package com.qa.appTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.Service;

import junit.framework.Assert;

public class CountNameTest {

	@Test
	public void test() {
		Account account1 = new Account("Michael","Massey","12345");
		Account account2 = new Account("Joe", "Bloggs", "00001");
		Account account3 = new Account("Michael", "Smith", "00011");
		Account account4 = new Account("Joe","Bob", "00012");
		Account account5 = new Account("Joe", "Name", "11111");
		Service service = new Service();
		service.addAccount(1, account1);
		service.addAccount(2, account2);
		service.addAccount(10, account3);
		service.addAccount(3, account4);
		service.addAccount(6, account5);
		service.countFirstName("Michael");
		service.countFirstName("Joe");
		Assert.assertEquals(2, service.countFirstName("Michael"));
		Assert.assertEquals(3, service.countFirstName("Joe"));
		
	}

}
