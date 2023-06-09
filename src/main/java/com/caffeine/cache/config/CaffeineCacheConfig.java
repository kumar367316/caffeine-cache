package com.caffeine.cache.config;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

@Configuration
public class CaffeineCacheConfig {

	@Bean
	public CacheManager cacheManager() {
		CaffeineCacheManager cacheManager = new CaffeineCacheManager("customer");
		cacheManager.setCaffeine(caffeineCacheBuilder());
		return cacheManager;
	}

	Caffeine<Object, Object> caffeineCacheBuilder() {
		return Caffeine.newBuilder().initialCapacity(18).maximumSize(12).expireAfterAccess(3, TimeUnit.MINUTES)
				.weakKeys().recordStats();
	}
}