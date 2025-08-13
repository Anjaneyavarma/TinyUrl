package com.tinyurl.redirection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TinyurlRedirectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyurlRedirectionApplication.class, args);
	}

}
