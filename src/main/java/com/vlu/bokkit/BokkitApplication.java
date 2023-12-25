package com.vlu.bokkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@SpringBootApplication
@ComponentScan("com.vlu.bokkit.service")
@ComponentScan(basePackages = "com.vlu.bokkit.repository")
public class BokkitApplication {

	public static void main(String[] args) {
		SpringApplication.run(BokkitApplication.class, args);
	}

}
