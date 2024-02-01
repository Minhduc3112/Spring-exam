package com.vn.spring.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.vn.spring.login.models"})
@EnableJpaRepositories(basePackages = {"com.vn.spring.login.repository"})
public class SpringBootLoginExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginExampleApplication.class, args);
	}

}
