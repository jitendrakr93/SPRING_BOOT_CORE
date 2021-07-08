package com.jit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		DatabaseConnection dbc = ctx.getBean("dbcon", DatabaseConnection.class);
		System.out.println(dbc);
	}

}
