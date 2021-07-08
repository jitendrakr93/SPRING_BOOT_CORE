package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.jit.boot.order.custom.CustomOrder;

@Component
@Order(CustomOrder.FIRST)
public class DbPoolRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DB Pool Runner");
	}

}
