package com.christiansiegel.spring.apifirst;

import io.swagger.oas.inflector.OpenAPIInflector;
import io.swagger.oas.inflector.config.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApifirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApifirstApplication.class, args);
	}

	@Bean
	Configuration configuration(ApplicationContext applicationContext) {
		Configuration configuration = Configuration.read();
		configuration.setControllerFactory((cls, operation) -> applicationContext.getBean(cls));
		return configuration;
	}

	@Bean
	OpenAPIInflector swagger(Configuration configuration) {
		return new OpenAPIInflector(configuration);
	}

}
