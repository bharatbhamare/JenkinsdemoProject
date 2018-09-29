package com.example.Jenkinsdemo;

import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/getHello")
	public String getHello()
	{
		return "Hello World";
	}
}
