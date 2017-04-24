package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientDataServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(ClientDataServiceApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ClientDataServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(ClientRepository repository) {
		return (args) -> {
			// save a couple of clients
			repository.save(new Client("Jack", "Bauer"));
			repository.save(new Client("Chloe", "O'Brian"));
			repository.save(new Client("Kim", "Bauer"));
			repository.save(new Client("David", "Palmer"));
			repository.save(new Client("Michelle", "Dessler"));
			repository.save(new Client("Tufail", "Smith"));
			repository.save(new Client("Jack", "Bauer"));
			repository.save(new Client("Clyde C.", "Frog"));
			repository.save(new Client("Shannon", "Bloodbath"));
			repository.save(new Client("Darren", "El Dorado"));
			repository.save(new Client("Jonathan", "Countryham"));

		};
	}

}


