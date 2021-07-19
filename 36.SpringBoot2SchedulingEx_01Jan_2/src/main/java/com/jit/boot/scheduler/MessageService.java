package com.jit.boot.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	@Scheduled(cron = "10 * * * * *")
	public void showMsg() {
		System.out.println("FROM MESSAGE " + new Date());
		}
}
