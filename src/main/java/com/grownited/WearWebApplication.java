package com.grownited;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SpringBootApplication
public class WearWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WearWebApplication.class, args);
	}
	@Bean
	PasswordEncoder encoder() {
		return new BCryptPasswordEncoder(5);
	}
	
	@Bean
	Cloudinary cloudinary() {
		Map<String, String> config = ObjectUtils.asMap("cloud_name", "ddruk5atc", "api_key", "519627746186775",
				"api_secret", "Q5MKUmBSPXO_BLpeb0znKfCp3X4");
		return new Cloudinary(config);
	}
}
