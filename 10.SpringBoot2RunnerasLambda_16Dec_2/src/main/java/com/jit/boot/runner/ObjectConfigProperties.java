package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Product;

@Component
@ConfigurationProperties(prefix = "my.app")
public class ObjectConfigProperties implements CommandLineRunner{

	private Product pob;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(pob);
		
	}

	public Product getPob() {
		return pob;
	}

	public void setPob(Product pob) {
		this.pob = pob;
	}
	
	

}
