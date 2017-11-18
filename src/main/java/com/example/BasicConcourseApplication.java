package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@SpringBootApplication
//@EnableOAuth2Sso
@RestController
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@EnableResourceServer
//@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class BasicConcourseApplication {

  private static Logger log = LoggerFactory.getLogger(BasicConcourseApplication.class);
    


    public static void main(String[] args) {
		SpringApplication.run(BasicConcourseApplication.class, args);
	}


    @RequestMapping("/")
    public String index() throws Exception {
       log.info("Handling greetings"); 
       return "Greetings from DF V2";    
}    




}
