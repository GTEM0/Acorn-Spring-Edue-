package com.acorn.day5.cookie;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/login") // 매핑 이름이 /login/login 이라고 자동으로 만들어짐
	public String loginForm() {		 
		return "loginForm";
	}
	
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public String login(String id, String pwd , boolean rememberId , HttpServletResponse response, HttpServletRequest request ) {		
		//로그인 성공했을 때
		if( loginCheck(id, pwd)) {
			
			//세션에 저장
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", id);   // acorn  1234    =>   acorn => 세션 저장소 저장함 
			
			//아이디 기억
			if(rememberId) {
			//저장	
				Cookie cookie  = new Cookie("id", id );
				response.addCookie(cookie);				
			}else {			//삭제
		
				Cookie cookie = new Cookie("id" , id);
				cookie.setMaxAge(0);				
				response.addCookie(cookie);
			}
			
			return "main";			
		}else {
		//로그인 실패했을 때
			String msg= URLEncoder.encode( "id   pwd   불일치  확인하세요");
			return "redirect:/login/login?msg=" + msg;  // respone.sendRedirect("/login/");
		}		
	}
	
	@RequestMapping("/logOut")
	public String logOut( HttpServletRequest request) {
		HttpSession session =request.getSession();
		session.invalidate();	
		return "redirect:/";
	}
	
	public boolean loginCheck(String id, String pwd) {
		if( id.equals("acorn") && pwd.equals("1234")){
			return true;
		}else {
			return false;
		}	 
	}
}
