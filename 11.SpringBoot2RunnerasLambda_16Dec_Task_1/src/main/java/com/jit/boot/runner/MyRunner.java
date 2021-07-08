package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.jit.boot.model.Student;
@Component
@ConfigurationProperties(prefix = "my.app")
public class MyRunner implements CommandLineRunner{

	private Student student;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(student);
		
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
