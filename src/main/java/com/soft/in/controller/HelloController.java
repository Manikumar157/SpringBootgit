package com.soft.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String Hello() {
		return "hello git";
	}
	
	public String Test() {
		return "hello git";
	}
	public String M1() {
		return "hello git";
	}
	
	public String M2() {
		return "hello git";
	}
	

}
