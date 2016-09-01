package com.example;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSpringCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSpringCloudDemoApplication.class, args);
	}
}
