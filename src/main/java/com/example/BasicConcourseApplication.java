package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class BasicConcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicConcourseApplication.class, args);
	}


    @RequestMapping("/")
    public String index() {
        return "Greetings from Paris!";
    }
}
