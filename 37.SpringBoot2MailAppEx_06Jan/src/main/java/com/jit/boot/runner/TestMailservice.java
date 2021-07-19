package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.jit.boot.util.MyMailService;


//@Component
public class TestMailservice implements CommandLineRunner {
	@Autowired
	private MyMailService service;
	
	@Override
	public void run(String... args) throws Exception {
		Resource resource = new FileSystemResource("F:/Images/SpringBoot7AM_06012021.png");
		
		boolean sent = service.send(
				"javaraghu2018@gmail.com", 
				new String[] {
						"akash671996@gmail.com", 
						"tbteja961@gmail.com", 
						"namdev15swatantra@gmail.com", 
						"vukkum93@gmail.com", 
						"pdutta.rang@gmail.com"
				}, 
				new String[] {
					"vikashsonu1995@gmail.com", 
					"shindenilesh888@gmail.com", 
					"shashipatil.sap@gmail.com",
					"sudhi99ems@gmail.com"
				}, 
				"WELCOME TO ALL EMAIL",
				
				"<html><body><h1>WELCOME TO NIT STUDNTS</h1></body></html>", 
				
				resource);
		
		if(sent) {
			System.out.println("Email sent");
		} else {
			System.out.println("problem in sending...");
		}
		
	}

}
