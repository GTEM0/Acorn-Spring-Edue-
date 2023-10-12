package com.acorn.day4.숫자추출;

import java.util.Scanner;

public class 회문2 {

	public String solution(String str) {
		String answer = "no";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "yes";
		return answer;
	}

	public static void main(String[] args) {
		회문2 p = new 회문2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(p.solution(str));

	}

}