package com.acorn.day4.숫자추출;

import java.util.Scanner;

public class 숫자추출1 {

	public int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x >= 48 && x <= 57)  answer = answer * 10 + (x-48);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		숫자추출1 p = new 숫자추출1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(p.solution(str));

	}

}