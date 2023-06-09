package com.caffeine.cache.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {

	private long id;
	private String email;
	private String name;
	public Customer(long id, String email, String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}
	
	
	
}
