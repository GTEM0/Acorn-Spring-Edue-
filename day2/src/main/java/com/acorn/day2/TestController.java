package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//매핑을 매서드 단위로 한다

//1. 문제
@Controller
public class TestController {
//url입력 예시 -> day2/gugudan?dan=5
	
	@Autowired // 외부의 것을 쓰겠다고 주입함. 외부의 테스트서비스를 쓰겠다고 주입.
	TestService service;

	@RequestMapping("/gugudan") // controller
	public String test1(@RequestParam(required = false, defaultValue = "2") int dan, Model model) { // @requestparam생략가능
						//url에 day2/gugudan만 입력하면됨				
		ArrayList<String> danList = service.getDan(dan);
		model.addAttribute("list", danList);
		System.out.println(dan);
		return "test"; // view
	}

}
