package com.acorn.day4.form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class formController {

		@GetMapping("/formRead")
		public String form() {
			return "formView";
			
		}
		
		@GetMapping("/formRegisterGet")
		public void formget(HttpServletRequest request) {
			String id = request.getParameter("id");		//form name값이 key로 사용됨
			String pw = request.getParameter("pw");
			
			System.out.println(id);
			System.out.println(pw);
			
			//request.getInputStream();	//body에 보낸게 없으면 읽을게 없어서 이따가 적겠다..
		}
		
		@PostMapping("/formRegisterPost")
		public void formpost(HttpServletRequest request) throws IOException {
			BufferedReader reader = new BufferedReader ( new InputStreamReader ( request.getInputStream()));
			String line = "";
			StringBuilder resultData = new StringBuilder();
			
			while((line = reader.readLine()) != null) {
				resultData.append(line);
			}
			System.out.println(resultData);
		}
		
}

