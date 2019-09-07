package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.boot.repo")
@EntityScan("com.example.boot.model")
@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
