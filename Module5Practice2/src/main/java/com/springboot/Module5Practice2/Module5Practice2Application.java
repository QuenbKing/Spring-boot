package com.springboot.Module5Practice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Module5Practice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Module5Practice2Application.class, args);
	}

}
