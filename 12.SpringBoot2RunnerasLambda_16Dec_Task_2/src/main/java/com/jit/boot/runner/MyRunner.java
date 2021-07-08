package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Information;

@Component
public class MyRunner implements CommandLineRunner{

	@Autowired
	private Information information;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(information);
		
	}

}
