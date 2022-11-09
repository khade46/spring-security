package com.ecommerse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ECommerseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerseApplication.class, args);
	}

}
