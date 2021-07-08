package com.myapp.jit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("2SD12CS043")
	public String eCode;

	@Override
	public String toString() {
		return "Employee [eCode=" + eCode + "]";
	}
	
	

}
