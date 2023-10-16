package com.acorn.service;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	public void insertMember(String id, String name, String latitude, String longitude) {
		
		//mybatis
		//jdbc
		System.out.println("회원테이블에 등록");
		System.out.println(id + name + latitude + longitude);
	}
	
}
