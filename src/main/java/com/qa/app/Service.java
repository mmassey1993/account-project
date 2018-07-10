package com.qa.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Service {
	
	private HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	public HashMap<Integer, Account> getAccountMap() {
		return accountMap;
	}

	public void setAccountMap(HashMap<Integer, Account> accountMap) {
		this.accountMap = accountMap;
	}

	public String addAccount(int key, Account account) {
		
		if (accountMap.containsKey(key)) {
			return "This key is already taken. Choose a new key.";
		} else accountMap.put(key, account);
		return "Account added.";
	}
	
	public Account getAccount(int key) {
		
		return accountMap.get(key);
	}
	
	public String removeAccount(int key) {
		
		if (accountMap.containsKey(key)) {
			accountMap.remove(key);
			return "Account removed";
		} else return "This account does not exist.";
		
	}
	
	public String checkIfBlocked(int key, String accountnumber) throws AccountBlockedException{
		Account check = accountMap.get(key);
		if (check.getAccountNumber().equals("123456")) {
			throw new AccountBlockedException("Account number " + check.getAccountNumber() + " is blocked.");
		}
		return accountnumber;
	}

	public int countFirstName(String firstname) {
		
		return (int) accountMap.values().stream().filter(e -> e.getFirstName().equals(firstname)).count();
//		int count = 0;
//		Iterator<Entry<Integer, Account>> it = accountMap.entrySet().iterator();
//		while (it.hasNext()) {
//			Entry<Integer, Account> entry = it.next();
//			if (entry.getValue().getFirstName().equals(firstname)) {
//				count++;
//			}
//		}
//		return count;
	}

}
