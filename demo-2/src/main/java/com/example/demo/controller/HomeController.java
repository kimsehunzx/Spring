package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.GreetingService;

@Controller
public class HomeController {
	@Autowired
	@Qualifier("greetingServiceEng")
	private GreetingService service;
	
	public void execute() {
		service.sayHello();
	}
	
	@GetMapping("/home")
	public void home(Model model) {
		model.addAttribute("greet", service.getGreeting());
	}
}