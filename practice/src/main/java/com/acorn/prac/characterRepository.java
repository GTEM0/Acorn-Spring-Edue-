package com.acorn.prac;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class characterRepository {

	@Autowired
	private SqlSession session;
	
	private static String ns = " com.acorn.charactorMapper.";
	
	
	
}
