package com.example.demosesion4sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@SpringBootApplication
public class Demosesion4sbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demosesion4sbApplication.class, args);
	}

	/**
	 * Agrega el dialecto Spring Security Dialect a Thymeleaf
	 **/
	@Bean
	public SpringSecurityDialect springSecurityDialect(){
		return new SpringSecurityDialect();
	}

}
