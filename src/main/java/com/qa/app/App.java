package com.qa.app;

import java.io.IOException;

import com.fasterxml.jackson.databind.*;
import com.thoughtworks.xstream.XStream;

public class App {

	public static void main(String[] args) throws AccountBlockedException {
		Account account1 = new Account("Michael", "Massey", "000001");
		Account account2 = new Account("Bill", "Odie", "123456");
		Service service = new Service();
		ObjectMapper mapper = new ObjectMapper();
		XStream xstream = new XStream();
		
		
		service.addAccount(1, account1);
		service.checkIfBlocked(1, "000001");
		service.getAccount(1);
		service.addAccount(2, account2);
		service.checkIfBlocked(2, "123456");
		
//		try {
//			String jsonStr = mapper.writeValueAsString(service.getAccount(1));
//			System.out.println(jsonStr);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//			String xmlStr = xstream.toXML(service.getAccount(1));
//			System.out.println(xmlStr);
		
		

	}

}
