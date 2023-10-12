package com.acorn.day4.숫자추출;

import java.util.Scanner;

public class 회문1 {

	public boolean solution(String str) {
		boolean answer = true;
		str = str.toUpperCase();
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				answer = false;
		}
		return answer;
	}

	public static void main(String[] args) {
		회문1 p = new 회문1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = (p.solution(str)) ? "ok" : "no";
		System.out.println(result);

	}

}