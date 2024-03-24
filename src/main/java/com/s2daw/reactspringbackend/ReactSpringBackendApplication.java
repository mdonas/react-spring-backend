package com.s2daw.reactspringbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactSpringBackendApplication {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			System.out.println("Lola + " +i);
		}
		SpringApplication.run(ReactSpringBackendApplication.class, args);
	}

}
