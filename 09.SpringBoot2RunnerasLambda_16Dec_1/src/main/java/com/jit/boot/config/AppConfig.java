package com.jit.boot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public CommandLineRunner clrOb() {
		/*CommandLineRunner c = (args) -> System.out.println(args);
		return c;*/
		return (args) -> System.out.println("FROM LAMBDA BASIC EXAMPLE");
	}

}
