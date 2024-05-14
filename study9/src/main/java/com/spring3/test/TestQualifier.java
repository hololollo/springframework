package com.spring3.test;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring3.dao.SampleDAOImpl;

public class TestQualifier {
	
	// Qualifier란? => java의 기능. 아이디와 클래스 이름이 다를경우. 못 찾을까봐 넣은 기능이다. ex) sqlSession 과 SqlSessionTemplate.
	@Autowired
	@Qualifier("sqlSession")
	
	private SqlSessionTemplate sqlSessionTemplate;
	

}
