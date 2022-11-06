package com.jenkins.test.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JenkinsTestController {
	@RequestMapping("/")
	public String test() {
		//String currentISTDateTime = new Date().toString();
		Date date = new Date();  
		DateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
		String currentISTDateTime = formatter.format(date);
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		String currentESTDateTime = formatter.format(date);  
		//return "{ \"IST\" : \""+currentISTDateTime+"\"}";
		return "{ \"LOCAL\" : \""+currentISTDateTime+"\", \"EST\" : \""+currentESTDateTime+"\"}";
	}
}
