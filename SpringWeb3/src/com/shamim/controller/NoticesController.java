package com.shamim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticesController {

	@RequestMapping("/")
	public String showHome(Model model) {
		
		model.addAttribute("name", "Parvez");
		
		return "home";
	}
}
