package com.jit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.jit.boot.bean.Product;

@SpringBootApplication
@PropertySource("classpath:myinfo.properties")
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Product p = ctx.getBean("product", Product.class);
		System.out.println(p);
	}

}
