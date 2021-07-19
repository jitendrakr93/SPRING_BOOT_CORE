package com.jit.boot.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

	@Scheduled(initialDelay = 4000,fixedRate =1000 )
	public void showMsg() {
		System.out.println("FROM MESSAGE " + new Date());
	}

}
