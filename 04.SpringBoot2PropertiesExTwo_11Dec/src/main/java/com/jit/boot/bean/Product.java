package com.jit.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@Value("${my.prod.id}")
	private Integer pid;
	
	@Value("${my.prod.code}")
	private String pcode;
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + "]";
	}
	
	
}
