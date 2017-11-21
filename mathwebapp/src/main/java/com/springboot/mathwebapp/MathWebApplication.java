package com.springboot.mathwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication

@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MathWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathWebApplication.class, args);
	}
}
