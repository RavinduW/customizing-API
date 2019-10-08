package com.rest.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This is the main class

@SpringBootApplication 
public class Application {
	
	//start the application and host into a servlet container
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
}
