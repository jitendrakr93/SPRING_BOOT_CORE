package com.jit.boot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Information {
	@Value("${myapp.id}")
	private int id;
	
	@Value("${myapp.code}")
	private String code;
	
	@Value("${myapp.model}")
	private String model;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Information [id=" + id + ", code=" + code + ", model=" + model + "]";
	}
	
	

}
