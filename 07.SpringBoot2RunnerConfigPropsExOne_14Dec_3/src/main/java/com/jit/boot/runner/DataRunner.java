package com.jit.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class DataRunner implements CommandLineRunner{

	private Integer id;
	private String code;
	private Double cost;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "DataRunner [id=" + id + ", code=" + code + ", cost=" + cost + "]";
	}

	
}
