package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import java.util.*;
import static org.springframework.http.HttpStatus.*;

@RestController
public class BasicController {

        @RequestMapping("/read")
        @PreAuthorize("#oauth2.hasScope('cloud_controller.read')")
        public String read() {
                return "your user has read access";
        }
 
        @RequestMapping("/admin")       
        @PreAuthorize("#oauth2.hasScope('cloud_controller.admin')")
        public String admin() {
             return "your user has admin access";
        }

}
