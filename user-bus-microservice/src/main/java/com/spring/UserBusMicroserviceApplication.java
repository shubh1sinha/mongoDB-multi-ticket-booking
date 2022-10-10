package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/****
 * 
 * @project Multi-ticket module
 * @author shubh-sinha
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserBusMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBusMicroserviceApplication.class, args);

	}

}
