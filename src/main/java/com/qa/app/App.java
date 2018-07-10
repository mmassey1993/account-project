package com.qa.app;

import java.io.IOException;

import com.fasterxml.jackson.databind.*;

public class App {

	public static void main(String[] args) {
		Account account1 = new Account("Michael", "Massey", "0123456");
		Service service = new Service();
		ObjectMapper mapper = new ObjectMapper();
		
		service.addAccount(1, account1);
		
		try {
			String jsonStr = mapper.writeValueAsString(service.getAccount(1));
			System.out.println(jsonStr);
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
