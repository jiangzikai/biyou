package com.kaihang.biyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BiyouApplication {
	@RequestMapping("/")
	String index(){
		return "hello spring boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(BiyouApplication.class, args);
	}
}
