package com.jit.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbcon")
public class DatabaseConnection {

	@Value("OracleDriver")
	private String driver;
	
	@Value("jdbc : oracle")
	private String url;

	@Override
	public String toString() {
		return "DatabaseConnection [driver=" + driver + ", url=" + url + "]";
	}
	
}
