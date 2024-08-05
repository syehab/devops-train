package com.example.devops_train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsTrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsTrainApplication.class, args);
	}

	@RestController
    class HelloController {
        @GetMapping("/")
        public String hello() {
            return "Hello, DevOps-Train basic pipeline Successfull...";
        }
    }

}
