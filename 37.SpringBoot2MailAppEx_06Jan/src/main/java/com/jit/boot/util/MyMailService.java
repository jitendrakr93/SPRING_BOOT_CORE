package com.jit.boot.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MyMailService {

	@Autowired
	private JavaMailSender sender;

	public boolean send(
			String to,
			String[] cc,
			String[] bcc,
			String subject,
			String text,
			Resource resource
			) 
	{
		boolean isSent=false;
		try {
			//1. creating new message
			MimeMessage message = sender.createMimeMessage();
			
			//2. Fill data (helper-message,file exist)
			MimeMessageHelper helper = new MimeMessageHelper(message,resource!=null);
			
			helper.setTo(to);
			if(cc!=null)
				helper.setCc(cc);
			if(bcc!=null)
				helper.setBcc(bcc);
			
			helper.setSubject(subject);
			//helper.setText(text); //default false, send as plain text
			helper.setText(text,true); //send as HTML output
			
			if(resource!=null) //filename, file object
				helper.addAttachment(resource.getFilename(), resource);
			
			//3. send message
			sender.send(message);
			
			isSent=true;
		} catch (Exception e) {
			isSent=false;
			e.printStackTrace();
		}
		return isSent;
	}
}
