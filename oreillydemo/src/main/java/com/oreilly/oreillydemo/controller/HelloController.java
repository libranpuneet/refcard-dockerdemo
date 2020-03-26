package com.oreilly.oreillydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {


@GetMapping("/hello")	// http://localhost:8080/hello?name=aashi
//@PathVariable("id)  would be when your URL looks like http://../{id}
 public String sayHello(@RequestParam(required=false,
 defaultValue = " World") String name,
		 Model model) {
	
		model.addAttribute("user", name);
	 return "hello";
 }


} //end of class
