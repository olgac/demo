package com.olgac.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RestController
	class Check {
		@Value("${spring.profiles.active}")
		private String profile;

		@GetMapping("health")
		public String health() {
			return "I'm ".concat(profile).concat(" env. :)");
		}
	}

}
