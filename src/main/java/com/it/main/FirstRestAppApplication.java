package com.it.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//(scanBasePackages = { "com.it.main.controller", "com.it.main.service.impl","com.it.main.service", "com.it.main.repository" })
@EnableJpaRepositories
@EntityScan
@EnableTransactionManagement
public class FirstRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestAppApplication.class, args);
	}

}
