package com.blogspot.creamymilktea.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.blogspot.creamymilktea.thymeleaf"})
@EnableJpaRepositories(basePackages="com.blogspot.creamymilktea.thymeleaf.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.blogspot.creamymilktea.thymeleaf.entity")
public class ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}

}
