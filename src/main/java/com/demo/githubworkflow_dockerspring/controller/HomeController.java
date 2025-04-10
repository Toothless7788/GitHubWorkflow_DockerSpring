package com.demo.githubworkflow_dockerspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping
	public String index() {
		return "This is an example project which demonstrates the CI/CD using GitHub Workflow";
	}
}
