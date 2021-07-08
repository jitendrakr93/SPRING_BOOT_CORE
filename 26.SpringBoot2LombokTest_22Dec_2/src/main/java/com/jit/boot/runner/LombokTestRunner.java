package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.beans.Employee;

@Component
public class LombokTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee();
		e1.setEmpId(100);
		e1.setEmpName("AA");
		e1.setEmpSal(2500.0);
		Employee e2 = new Employee(101, "AA", 200.0);
		// System.out.println(emp.getEmpId());
		System.out.println(e1);// toString
		System.out.println(e1.equals(e2)); // true or false?

	}

}
