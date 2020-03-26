package com.example.dockerdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping ("/api/hello")
public class HelloController {
	
	private static final String RESPONSE_STRING_FORMAT=
			"Hello from '%s':%d\n";
	
	private int counter=0;
	
	@GetMapping
	public String helloWorld() {
		
		counter++;
		System.out.println("Counter Value ::" +counter);
		return String.format(RESPONSE_STRING_FORMAT,System.getenv().
				getOrDefault("HOSTNAME", "unkown"),counter);
		
		
	}

}
