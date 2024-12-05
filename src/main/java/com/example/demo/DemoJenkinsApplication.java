package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static Logger logger=LoggerFactory.getLogger(DemoJenkinsApplication.class);
	
	@PostConstruct
    public void intt() {
		logger.info("Application Started !!!!");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
