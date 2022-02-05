package com.example.mybooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.mybooks"})
@EnableJpaRepositories(basePackages = {"com.example.mybooks"})
public class MyBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBooksApplication.class, args);
	}

}
