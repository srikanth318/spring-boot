package com.feign.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientProjectApplication.class, args);
	}

}
