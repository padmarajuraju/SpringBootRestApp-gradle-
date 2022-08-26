package com.kkjavatutorials.SpringBootRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path = "/welcome")
	public String welcome() {
		return "jenkins assignment--Design and develop tasks required to build CICD pipeline using learned technologies to deploy 2-Tier application on cloud platform as a set of microservices on containerized platform such as docker. Deploy a web application on Docker container using   GRADLE as build tool to install, test, package application which is fetched from GitHub Repository & deploy through Web Application . Provision Infrastructure on AWS.";
	}

}
