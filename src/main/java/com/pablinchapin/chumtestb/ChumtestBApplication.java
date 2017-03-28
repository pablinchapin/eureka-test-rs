package com.pablinchapin.chumtestb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ChumtestBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChumtestBApplication.class, args);
	}
}
