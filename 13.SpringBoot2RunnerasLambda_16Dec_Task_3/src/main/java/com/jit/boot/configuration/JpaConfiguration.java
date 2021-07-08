package com.jit.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jit.boot.model.JpaData;

@Configuration
public class JpaConfiguration {
	
	@Bean("jpaData")
	public JpaData getJpaData() {
		JpaData jpaData = new JpaData();
		jpaData.setDdlAuto("DDLAUTO");
		jpaData.setDialect("HIBERNATE DIALECT");
		jpaData.setShowSql(true);
		return jpaData;
	}

}
