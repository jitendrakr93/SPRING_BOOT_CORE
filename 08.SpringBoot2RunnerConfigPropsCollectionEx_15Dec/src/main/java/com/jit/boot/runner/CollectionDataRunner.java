package com.jit.boot.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class CollectionDataRunner implements CommandLineRunner{
	
	//private List<String> data;
	//private Set<String> data;
	private String[] data;
	private Map<String,Integer> subjects;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	
	@Override
	public String toString() {
		return "MyRunner [data=" + Arrays.toString(data) + "]"+"\n"+"Subjacts --->"+subjects;
	}

	/*public List<String> getData() {
		return data;
	}



	public void setData(List<String> data) {
		this.data = data;
	}*/



	

	/*

	public Set<String> getData() {
		return data;
	}
	



	public void setData(Set<String> data) {
		this.data = data;
	}
*/
	


	public String[] getData() {
		return data;
	}



	public void setData(String[] data) {
		this.data = data;
	}

	public Map<String, Integer> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, Integer> subjects) {
		this.subjects = subjects;
	}
	
	

}
