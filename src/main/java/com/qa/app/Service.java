package com.qa.app;

import java.util.HashMap;

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
	
	public String getAccount(int key) {
		
		return accountMap.get(key).toString();
	}
	
	public String removeAccount(int key) {
		
		if (accountMap.containsKey(key)) {
			accountMap.remove(key);
			return "Account removed";
		} else return "This account does not exist.";
		
	}

}
