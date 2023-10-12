package com.acorn.day5.ex;

public class 예외처리연습 {

	public static void main(String[] args) {

		예외처리연습 ex = new 예외처리연습();

		try {
			ex.method7();
		} catch (Exception e) {
			System.out.println("예외가 발생했다 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("나머지 부분 처리한다");
		}

		System.out.println("정상 종료");
	}

	public void method7() throws Exception {
	    try {
	        int su1 = 12; // 변수의 값은 예시로 12라고 가정
	        if (su1 > 10) {
	            throw new Exception("예외 발생 : 변수 값이 10을 초과했다.");
	        }
	    } catch (Exception ex) {
	        System.out.println("시 to the 작");
	        throw ex;
	    }
	}
}

