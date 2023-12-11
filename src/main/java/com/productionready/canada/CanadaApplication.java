package com.productionready.canada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.productionready.canada.repository")
@EntityScan(basePackages = "com.productionready.canada.domain")
@EnableAutoConfiguration
public class CanadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanadaApplication.class, args);
	}

}
