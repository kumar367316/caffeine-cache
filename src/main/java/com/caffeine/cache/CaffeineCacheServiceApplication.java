package com.caffeine.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CaffeineCacheServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaffeineCacheServiceApplication.class, args);
	}

}
