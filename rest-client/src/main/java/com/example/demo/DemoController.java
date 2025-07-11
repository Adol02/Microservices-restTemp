package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.*;
@RestController
public class DemoController {
//	private String msg = "demo project";
	private RestTemplate rt = new RestTemplate();
	@RequestMapping("/greetcall")
	Greet greet() {
		Greet greet = rt.getForObject("http://localhost:8090/greet", Greet.class);
		return greet;
	}

};
