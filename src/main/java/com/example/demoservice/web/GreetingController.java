package com.example.demoservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoservice.business.GreetingService;

@RestController
public class GreetingController {
	
	
	
	private final GreetingService greetingService;

	@Autowired
	 public GreetingController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	@RequestMapping("/greeting/{who}")
	 
	 public String greeting(@PathVariable  String who ) {
		 return "Hello " + who + " from " + this.greetingService.city(); 
	 }
}
