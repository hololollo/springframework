package com.spring3.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring3.dao.SampleDAO;
import com.spring3.dao.SampleDAOImpl;

public class TestAutowired {
	
	@Autowired
	private SampleDAO sampleDAO; // 필드주입 (권장하지 않는다. 업계에서 사장된 방식)
	
	public TestAutowired() { // 생성자 주입. @Autowired 생략이 가능하다. Spring에서 알아서 처리해줌.
		this.sampleDAO = new SampleDAOImpl();
	}
	
	
}
