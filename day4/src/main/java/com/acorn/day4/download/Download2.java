package com.acorn.day4.download;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Download2 {
	
	String fileDir = "c:\\test\\upload\\";
	
	@GetMapping("/download44")
	public String form() {
		return "form-download";		
	}
	
}
	