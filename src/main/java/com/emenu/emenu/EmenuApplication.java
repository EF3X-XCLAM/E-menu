package com.emenu.emenu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmenuApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CategoryRepository categoryRepository){
		return args -> {
			categoryRepository.findAll();
		};

	};

}
