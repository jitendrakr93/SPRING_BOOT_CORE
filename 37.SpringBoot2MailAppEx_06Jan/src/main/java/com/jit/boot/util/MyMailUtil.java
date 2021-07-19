package com.jit.boot.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.jit.boot.bean.MailBean;


@Component
public class MyMailUtil {

	@Autowired
	private JavaMailSender sender;

	public boolean send(
			MailBean mb,
			Resource resource
			) 
	{
		boolean isSent=false;
		try {
			//1. creating new message
			MimeMessage message = sender.createMimeMessage();
			
			//2. Fill data (helper-message,file exist)
			MimeMessageHelper helper = new MimeMessageHelper(message,resource!=null);
			
			helper.setTo(mb.getTo());
			if(mb.getCc()!=null)
				helper.setCc(mb.getCc());
			if(mb.getBcc()!=null)
				helper.setBcc(mb.getBcc());
			
			helper.setSubject(mb.getSubject());
			//helper.setText(text); //default false, send as plain text
			helper.setText(mb.getText(),true); //send as HTML output
			
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
