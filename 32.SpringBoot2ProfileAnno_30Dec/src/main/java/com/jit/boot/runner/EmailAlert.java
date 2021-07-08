package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("prod")
@Profile({ "prod", "qa" })
public class EmailAlert implements CommandLineRunner {
	@Value("${my.app.title}")
	private String title;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM EMAIL ALERT => " + title);
	}
}