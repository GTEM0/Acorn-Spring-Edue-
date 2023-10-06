package com.acorn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class practice {

	@GetMapping("/fighting1")
	public String fighting1(Model fighting) {
		fighting.addAttribute("message", "spring");
		return "fighting";
	}
	
	
	@GetMapping("/bookinfo")
	public String book(Model bookinfo) {
		bookinfo.addAttribute("message", "info");
		return "bookinfo";
	}
}
