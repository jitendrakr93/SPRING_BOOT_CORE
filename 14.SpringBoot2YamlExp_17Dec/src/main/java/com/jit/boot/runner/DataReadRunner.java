package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataReadRunner implements CommandLineRunner {

	@Value("${my.app.id}")
	private Integer pid;
	
	@Value("${my.app.name}")
	private String pname;
	
	@Value("${my.app.cost}")
	private Double pcost;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "DataReadRunner [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}

	
}
