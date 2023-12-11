package com.productionready.canada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = "com.productionready.canada.repository")
public class CanadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanadaApplication.class, args);
	}

}
