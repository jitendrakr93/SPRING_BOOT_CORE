package com.jit.boot.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.jit.boot.service.AlertService;

@Component
@Profile({ "qa", "prod" })
public class EmailAlertService implements AlertService {
	@Value("${my.app.service.code}")
	private String scode;

	@Override
	public void showAlertMsg() {
		System.out.println("FROM MAIL SERVICE => " + scode);
	}
}