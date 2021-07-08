package com.jit.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {

	@Value("${app.title-one}")
	public String title;
	
	@Value("${app.version}")
	public Double version;

	@Override
	public String toString() {
		return "AppInfo [title=" + title + ", version=" + version + "]";
	}
	
	
}
