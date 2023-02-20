package com.michel.reliability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michel.reliability.models.Tester;

@SpringBootApplication
public class ReserveMavenTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReserveMavenTestApplication.class, args);
		Tester tester = new Tester();
		tester.activer();
	}

}
