package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.MailBean;
import com.jit.boot.util.MyMailUtil;


@Component
public class TestMailserviceBean implements CommandLineRunner {
	@Autowired
	private MyMailUtil service;
	
	@Override
	public void run(String... args) throws Exception {
		Resource resource = new FileSystemResource("F:/Images/SpringBoot7AM_06012021.png");
		
		MailBean mb= new MailBean();
		mb.setTo("javaraghu2018@gmail.com");
		mb.setCc(new String[] {
				"jk93.161@gmail.com"
				});
		mb.setBcc(new String[] {
				"jitendrakr.cse@gmail.com"			
		});
		mb.setSubject("WELCOME TO ALL EMAIL USING BEAN UTIL");
		mb.setText("<html><body><h1>WELCOME TO NIT STUDNTS</h1></body></html>");
		
		boolean sent = service.send(mb,resource);
		
		if(sent) {
			System.out.println("Email sent");
		} else {
			System.out.println("problem in sending...");
		}
		
	}

}
