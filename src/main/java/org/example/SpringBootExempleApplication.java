package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories
@EntityScan("org.example.model")
public class SpringBootExempleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExempleApplication.class, args);
	}

	// private static CustomProperties properties;

	// @PostConstruct
	// public static void setProperties() {
	// properties = props;
	// }
	//
	// @Value("${api.url}")
	// private String props;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----");
	}

}