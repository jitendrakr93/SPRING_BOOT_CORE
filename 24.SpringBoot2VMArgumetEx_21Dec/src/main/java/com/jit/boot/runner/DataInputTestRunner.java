package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInputTestRunner implements CommandLineRunner {

	@Value("${my.app.export.data}")
	private String exportData;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(exportData);
	}

}
