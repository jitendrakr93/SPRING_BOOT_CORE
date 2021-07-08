package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class MyDataRunner implements CommandLineRunner {
	@Value("${my.app.title}")
	private String code;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
}
