package com.verissimo.siga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SigaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaApplication.class, args);
		System.out.println("VAMO QUE VAMO MEU CONSAGRADO!");
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry reg) {
				reg.addMapping("/**").allowedOrigins("http://localhost:4200");
			}
		};
	}

}
