package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.jit.boot.order.custom.CustomOrder;

@Component
//@Order(10)
@Order(CustomOrder.LAST)
public class MVCRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM MVC RUNNER");
	}

}
