package com.jit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jit.boot.bean.Product;
import com.myapp.jit.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Product p = ctx.getBean("product",Product.class);
		System.out.println(p);
		Employee e = ctx.getBean("employee",Employee.class);
		System.out.println(e);
	}

}
