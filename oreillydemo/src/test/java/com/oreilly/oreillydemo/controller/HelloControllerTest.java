package com.oreilly.oreillydemo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareConcurrentModel;

class HelloControllerTest extends HelloController {

	@Test
	void test() {
		//fail("Not yet implemented");
		HelloController controller= new HelloController();
		Model model= new BindingAwareConcurrentModel();
		
		String result= controller.sayHello("Dolly", model);
		assertEquals("hello", result);
		assertEquals("Dolly",model.asMap().get("user"));
		
	}

}
