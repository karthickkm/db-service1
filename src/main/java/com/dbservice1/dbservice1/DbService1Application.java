package com.dbservice1.dbservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DbService1Application {

	public static void main(String[] args) {
		SpringApplication.run(DbService1Application.class, args);
	}
}
