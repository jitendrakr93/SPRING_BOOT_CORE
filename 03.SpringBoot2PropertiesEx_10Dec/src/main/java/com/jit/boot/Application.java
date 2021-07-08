package com.jit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.jit.boot.bean.AppInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	ApplicationContext ctx = SpringApplication.run(Application.class, args);
	AppInfo app = ctx.getBean("appInfo",AppInfo.class);
	System.out.println(app);
	}

}
