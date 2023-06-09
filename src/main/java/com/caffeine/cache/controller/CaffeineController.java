package com.caffeine.cache.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caffeine.cache.model.Customer;
import com.caffeine.cache.service.CustomerService;

@RestController
public class CaffeineController {

	private static final Logger LOG = LoggerFactory.getLogger(CaffeineController.class);

	@Autowired
	CustomerService customerService;

	@GetMapping("/cachetest")
	public void caffeineCacheTest() {

		LOG.info("Starting the Caffine cache testing process");
		Customer customer1 = customerService.getCustomer(1l); // No hit , since this is the first request.
		System.out.println("customer1:" + customer1);
		Customer customer2 = customerService.getCustomer(2l); // No hit , since this is the first request.
		System.out.println("customer2:" + customer2);
		Customer customer3 = customerService.getCustomer(1l); // hit , since it is already in the cache.
		System.out.println("customer3:" + customer3);
		Customer customer4 = customerService.getCustomer(1l); // hit , since it is already in the cache.
		System.out.println("customer4:" + customer4);
		Customer customer5 = customerService.getCustomer(1l); // hit , since it is already in the cache.
		System.out.println("customer5:" + customer5);
	}

}
