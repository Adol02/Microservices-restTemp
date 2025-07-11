package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private String msg = "demo project";
	
	@RequestMapping("/greet")
	Greet greet() {
		return new Greet(msg);
	}

}
