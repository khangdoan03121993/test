package com.example.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemospringbootApplication {

	@GetMapping("/demo")
	public String demo(){
		return "demo by anhnn";
	}
	@GetMapping("/{input}")
	public String data(@PathVariable("input") String input){
		return "hi " +input + " application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootApplication.class, args);
	}

}
