package com.spring.cloud;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamApplication.class, args);
	}
	
	@Bean
	public Function<String,String> toUpperCase(){
		return value->{
			System.out.println("Uppercasting----->>>> "+value);
			return value.toUpperCase();
		};
	}

}
