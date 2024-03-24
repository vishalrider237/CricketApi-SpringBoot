package com.cricket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class CricketApiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketApiBackendApplication.class, args);
	}

}
