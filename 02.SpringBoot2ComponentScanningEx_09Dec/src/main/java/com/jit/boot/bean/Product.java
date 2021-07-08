package com.jit.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@Value("AA")
	public String pCode;

	@Override
	public String toString() {
		return "Product [pCode=" + pCode + "]";
	}

}
