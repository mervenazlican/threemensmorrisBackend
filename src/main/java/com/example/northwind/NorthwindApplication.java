package com.example.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration; 

@SpringBootApplication
@Configuration 
public class NorthwindApplication{

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}
 
}
