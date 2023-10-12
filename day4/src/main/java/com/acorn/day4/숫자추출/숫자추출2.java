package com.acorn.day4.숫자추출;

import java.util.Scanner;

public class 숫자추출2 {

	public int solution(String s) {
		String answer="";
		for(char x : s.toCharArray()) {
			if( x>= 48 && x <= 57) answer += x;
		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		숫자추출2 p = new 숫자추출2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(p.solution(str));

	}

}