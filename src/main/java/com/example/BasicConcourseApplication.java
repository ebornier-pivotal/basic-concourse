package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class BasicConcourseApplication {

  private static Logger log = LoggerFactory.getLogger(BasicConcourseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BasicConcourseApplication.class, args);
	}


    @RequestMapping("/")
    public String index() {
       log.info("Handling greetings"); 
       return "{\"Greetings from X!\"}";
    }
}
