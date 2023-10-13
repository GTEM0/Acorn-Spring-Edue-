package com.acorn.api;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DustController {
	
	@Autowired
	ApiExplorer2 api2;
	
	@Autowired
	ApiExplorer3 api3;
	
	@Autowired
	ApiExplorer4 api4;
	
	@ResponseBody
	@GetMapping(value ="/test1", produces = "application/json;charset=UTF-8")
	public String test1 () throws IOException {
		String result = api2.apitest();
		 
		return result ;
	}


	@GetMapping("/test2")
	public String test2 (Model model) throws IOException {
		String result = api3.apitest();
		ArrayList<ApiDTO> result2 = api3.apifilter(result);
		model.addAttribute("dust", result2);
		return "test2" ;
	}
	
	@GetMapping("/test3")
	public String test3 (Model model) throws IOException {
		String result = api4.apitest();
		ArrayList<ApiDTO2> result3 = api4.apifilter(result);
		model.addAttribute("dust", result3);
		return "test3" ;
	}
	
}