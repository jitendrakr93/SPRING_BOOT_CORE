package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("qa")
@Profile({"prod","qa"})
public class EmailAlert implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM EMAIL ALERT");
	}
}
