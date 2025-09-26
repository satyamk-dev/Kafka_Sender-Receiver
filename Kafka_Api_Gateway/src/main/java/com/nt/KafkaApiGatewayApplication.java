package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
public class KafkaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApiGatewayApplication.class, args);
	}

}
