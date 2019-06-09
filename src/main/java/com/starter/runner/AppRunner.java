package com.starter.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class AppRunner implements CommandLineRunner {

	@Value("${my.message}")
	private String msg;
	@Value("${my.code}")
	private String mode;
	@Value("${my.mode}")
	private String code;
	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
		
	}

}
