package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServerKafkaApplication {

	public static void main(String[] args) {
		  log.info("Starting Eureka Server Kafka Application...");
	        SpringApplication.run(EurekaServerKafkaApplication.class, args);
	        log.info("Eureka Server Kafka Application started successfully!");
	}

}
