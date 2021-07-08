package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner{

	@Value("${my.app.driver}")
	private String driver;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Value is :"+ driver);
		
	}

}
