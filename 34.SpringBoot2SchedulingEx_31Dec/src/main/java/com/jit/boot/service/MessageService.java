package com.jit.boot.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
//@Scheduled(fixedDelay = 120000) //2 mins
	@Scheduled(initialDelay = 3000, fixedDelay = 5000) // 5 sec
	public void showMsg() {
		System.out.println("FROM MESSAGE " + new Date());
	}
}