package com.jit.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jit.boot.service.AlertService;

@Component
public class ExecuteServiceRunner implements CommandLineRunner {
	/**
	 * -> goto container, 
	 * -> read impl class object
	 *  -> inject object to
	 * this(service) variable
	 */
	@Autowired
	private AlertService service;

	@Override
	public void run(String... args) throws Exception {
		service.showAlertMsg();
	}
}