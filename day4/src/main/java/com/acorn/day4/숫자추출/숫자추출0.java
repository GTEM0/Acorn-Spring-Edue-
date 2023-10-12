package com.acorn.day4.숫자추출;

import java.util.Scanner;

public class 숫자추출0 {

	public int solution(String s) {
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x>=48 && x<=57) answer=answer*10+(x-48);
		}
		return answer;
	}
	
	public static void main(String[] arsg) {
		숫자추출0 p = new 숫자추출0();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(p.solution(str));
	}
}

