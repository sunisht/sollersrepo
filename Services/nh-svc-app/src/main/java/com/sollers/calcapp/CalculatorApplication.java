package com.sollers.calcapp;

import com.sollers.calcapp.domain.Addition;
import com.sollers.calcapp.persistence.AdditionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication {
	private static final Logger log = LoggerFactory.getLogger(CalculatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AdditionRepository repository){
		return (args) -> {
			repository.save(new Addition(1, 2,4, 6, "Addition"));
		};
	}

}
