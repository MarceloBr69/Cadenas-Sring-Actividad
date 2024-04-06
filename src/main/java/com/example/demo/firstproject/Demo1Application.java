package com.example.demo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@RequestMapping("/")
	public String hello(){
		return "Hola cliente, como se encuentra?";
	}
	@RequestMapping("/random")
	public String secondMensaje() {
		return "Hola desde /random";
	}

}
