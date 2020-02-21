package com.mindtree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
public class MindTreeUseCaseApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MindTreeUseCaseApplication.class, args);
	}
}

