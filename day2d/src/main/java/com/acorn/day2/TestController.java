package com.acorn.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//매핑을 매서드 단위로 한다

//1. 문제
@Controller
public class TestController {

	@RequestMapping("/gugudan")
	public String test1(@RequestParam int dan) {	//@requestparam생략가능
		
		System.out.println(dan);
		return "test";
	}

}
