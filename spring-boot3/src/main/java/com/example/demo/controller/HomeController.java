package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "form";
	}
	
	@PostMapping("/confirm")
		public String confirm(ModelMap modelmap,@RequestParam("name") String name,@RequestParam("pass") String pass) {
			modelmap.addAttribute("name",name);
			modelmap.addAttribute("pass",pass);
			return "confirm";
	}
}
