package com.spring3.test;

import javax.inject.Inject;

import com.spring3.dao.SampleDAO;
import com.spring3.dao.SampleDAOImpl;

public class TestInject {
	@Inject
	private SampleDAO sampleDAO;
	
	public TestInject() { //@named를 사용하지 않았을 경우
		this.sampleDAO = new SampleDAOImpl();
	}
}
