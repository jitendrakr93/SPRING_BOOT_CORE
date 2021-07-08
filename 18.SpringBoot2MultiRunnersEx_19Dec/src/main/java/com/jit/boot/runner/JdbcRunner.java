package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.jit.boot.order.custom.CustomOrder;

@Component
//@Order(-909)
//@Order(Ordered.LOWEST_PRECEDENCE)
//@Order(Ordered.HIGHEST_PRECEDENCE)
@Order(CustomOrder.NEXT)
public class JdbcRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("JDBC Runner");

	}

}
