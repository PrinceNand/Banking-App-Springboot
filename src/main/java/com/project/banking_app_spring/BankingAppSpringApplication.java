package com.project.banking_app_spring;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot REST API Documentation Banking App",
				description = "Banking App Spring Boot REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Banking App",
						email = "bankingapp@gmail.com",
						url = "http://localhost:8080/api/accounts/allAccounts"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://localhost:8080/api/accounts/allAccounts"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Banking App Spring Boot User Management Documentation",
				url = "http://localhost:8080/api/accounts/allAccounts"
		)
)
public class BankingAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppSpringApplication.class, args);
	}

}
