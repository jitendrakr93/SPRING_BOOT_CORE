package com.jit.boot.runner;

import java.util.Arrays;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyCollDataReader implements CommandLineRunner {

	// private List<String> models;
	private String[] models;
	private Map<String, Integer> grades;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	public String[] getModels() {
		return models;
	}

	public void setModels(String[] models) {
		this.models = models;
	}

	public Map<String, Integer> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, Integer> grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "MyCollDataReader [models=" + Arrays.toString(models) + ", grades=" + grades + "]";
	}
	
	

}
