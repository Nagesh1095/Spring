package com.nsCorps.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println(this.getClass().getSimpleName()+" Object Created.............");
	}
	@GetMapping("/greet")
	public String greet() {
		System.out.println("Welcome to NS Corps.......");
		return "Greetings";
	}
}
