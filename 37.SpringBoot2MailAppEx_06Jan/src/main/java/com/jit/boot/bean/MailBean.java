package com.jit.boot.bean;

import lombok.Data;

@Data
public class MailBean {

	private String to;
	private String[] cc;
	private String[] bcc;
	private String subject;
	private String text;
}
