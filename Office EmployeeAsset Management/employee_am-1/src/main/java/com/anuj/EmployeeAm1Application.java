package com.anuj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmployeeAm1Application {
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAm1Application.class, args);
	}
	
	@Bean 
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
