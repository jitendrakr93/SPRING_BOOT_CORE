package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ProfileDataRunner implements CommandLineRunner{
	
	@Value("${my.app.title}")
	private String title;
	
	@Value("${my.app.loc}")
	private String loc;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	

}
