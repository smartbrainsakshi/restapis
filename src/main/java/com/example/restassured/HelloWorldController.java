package com.example.restassured;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Model.HelloWorldBean;

@RestController
public class HelloWorldController {
     
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloworld()
	{
		return "Hello world";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldbean()
	{
		return new HelloWorldBean("Hello World");
	}

	
}
