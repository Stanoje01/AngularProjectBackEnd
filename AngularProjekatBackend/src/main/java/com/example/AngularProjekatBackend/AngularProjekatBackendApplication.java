package com.example.AngularProjekatBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.AngularProjekatBackend.Entity"})
public class AngularProjekatBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularProjekatBackendApplication.class, args);
	}

}
