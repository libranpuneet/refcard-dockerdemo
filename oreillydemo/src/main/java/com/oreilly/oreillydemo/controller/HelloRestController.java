package com.oreilly.oreillydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oreilly.oreillydemo.entities.Greeting;

@RestController
public class HelloRestController {

	 @GetMapping("/rest")
	public Greeting greet(@RequestParam (required = false, defaultValue = "World") 
			String name) {
		return new Greeting("Hello," + name + "!");
	}
	
}
