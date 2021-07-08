package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner{

	@Value("${my.app.id}")
	private Integer id;
	
	@Value("${my.app.code}")
	private String code;
	
	@Value("${my.app.cost}")
	private Double cost;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "DataRunner [id=" + id + ", code=" + code + ", cost=" + cost + "]";
	}
	

}
