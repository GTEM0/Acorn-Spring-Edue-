package com.acorn.day4.숫자추출;

import java.util.Scanner;

public class 숫자추출3 {

	public int solution(String s) {
		String answer = "";
		for (char x : s.toCharArray()) {
			if (Character.isDigit(x))
				answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		숫자추출3 p = new 숫자추출3();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(p.solution(str));

	}

}