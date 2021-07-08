package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class TimeTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		//1. Create StopWatch Object
		StopWatch watch = new StopWatch();

		//2. start watch
		watch.start();

		//3. define logic
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow(i + 1, 909856);
		}

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow(i + 1, 909856);
		}

		//4. Stop watch
		watch.stop();

		//5. printing details
		System.out.println("In Milli second : " + watch.getTotalTimeMillis());
		System.out.println("In Second : " + watch.getTotalTimeSeconds());
	}

}
