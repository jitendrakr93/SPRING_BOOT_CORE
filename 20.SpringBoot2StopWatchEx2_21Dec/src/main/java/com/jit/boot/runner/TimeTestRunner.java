package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class TimeTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// 1. Create StopWAtch Object
		StopWatch watch = new StopWatch("Time Test For Loops");// Watch#Id

		// 2.Start Watch
		//watch.start();

		// 3.Define Logic
		watch.start("Loop#1"); // Watch#taskName
		for (int i = 0; i < 999999999; i++) {
			Math.pow(i + 1, 909856);
			Math.pow(i + 1, 909856);
		}
		watch.stop();

		watch.start("Loop#2"); // Watch#taskName
		for (int i = 0; i < 889999999; i++) {
			Math.pow(i + 1, 999956);
		}
		watch.stop();
		watch.start("Loop#3");
		for (int i = 0; i < 666699999; i++) {
		Math.pow(i+1, 998856);
		Math.pow(i+1, 998856);
		}
		watch.stop();
		//4. Stop watch
		//watch.stop();
		//5. printing details
		System.out.println(watch.prettyPrint());
		//System.out.println("In Mill Sec " +watch.getTotalTimeMillis());
		//System.out.println("In Sec "+watch.getTotalTimeSeconds());
		

	}

}
