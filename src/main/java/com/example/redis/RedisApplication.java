package com.example.redis;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.redis.config.RedisService;

@SpringBootApplication
public class RedisApplication {
	
	@Autowired
	private RedisService redisService;

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

}
