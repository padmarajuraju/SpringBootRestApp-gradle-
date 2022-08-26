package com.kkjavatutorials.SpringBootRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Launching springbootweb application on docker container using gradle and jenkins";
	}

}
