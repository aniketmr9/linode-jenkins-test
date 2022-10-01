package com.jenkins.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JenkinsTestController {
	@RequestMapping("/")
	public String test() {
		return "Hello Git!";
	}
}
