package com.spring3.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring3.dto.Store;
import com.spring3.vo.InjectionJava1;


@Service
public class InjectionJavaTest1 {
	
	public InjectionJava1 injectionJava1; //필드 주입. 권장되지 않는다. 
	
	//생성자(Constructor)로 주입
	@Autowired 
	// =>결국 이것때문에 this.injectionJava1이 이 클래스의 injectionJava가 아닌 vo 패키지의 injectionJava와 연결되게 끔 하는 역할
	public InjectionJavaTest1(InjectionJava1 injectionJava1) {
		this.injectionJava1 = injectionJava1;
	}
	
	//수정자 주입(Setter 주입)
	@Autowired
	public void setInjectionJava1(InjectionJava1 injectionJava1) {
		this.injectionJava1 = injectionJava1;
	}
	//일반 메서드 주입
	public Store getStore() {
		return injectionJava1.getStore();
	}	
}
