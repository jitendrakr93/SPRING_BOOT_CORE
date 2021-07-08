package com.jit.boot.runner;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TimeFactorRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		//3 days -> hours
		System.out.println(TimeUnit.DAYS.toHours(3));
		
		//3 days -> minutes
		System.out.println(TimeUnit.DAYS.toMinutes(3));
		
		//1 sec -> nano sec
		System.out.println(TimeUnit.SECONDS.toNanos(1));
		
		//10 min -> milli sec
		System.out.println(TimeUnit.MINUTES.toMillis(10));
		
	}

}
