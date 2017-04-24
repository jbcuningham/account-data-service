package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountDataServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(AccountDataServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccountDataServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(AccountRepository repository) {
		return (args) -> {
//			 save a couple of clients
			repository.save(new Account("1000", "1"));
			repository.save(new Account("1000", "2"));
			repository.save(new Account("1000", "3"));
			repository.save(new Account("1000", "4"));
			repository.save(new Account("1000", "5"));
			repository.save(new Account("1000", "6"));
			repository.save(new Account("1000", "7"));
			repository.save(new Account("1000", "8"));
			repository.save(new Account("1000", "9"));
			repository.save(new Account("1000", "10"));

		};
	}

}

