package com.example.service_regisry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class  ServiceRegisryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisryApplication.class, args);
	}

}
