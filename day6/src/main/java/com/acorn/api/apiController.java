package com.acorn.api;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class apiController {

	@Autowired
	api2 a2;
	
	@Autowired
	api3 a3;
	
	@ResponseBody
	@GetMapping(value ="/a21", produces = "application/json;charset=UTF-8")
	public String aaa() throws IOException{
		String result = a2.apitest();
		return result;
	}
	
	
	@GetMapping("/a22")
	public String aaa2(Model model) throws IOException{
		String result = a3.apitest();
		ArrayList<apidto> result2 = a3.apifilter(result);
		model.addAttribute("dust", result2);
		return "test2";
	}
	
	
	
}
