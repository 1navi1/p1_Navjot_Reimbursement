package com.revature.p1backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages= {"com.revature"})
public class P1finalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(P1finalBackendApplication.class, args);
	}

}

