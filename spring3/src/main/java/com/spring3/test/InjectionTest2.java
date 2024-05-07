package com.spring3.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring3.dto.Shop;

public class InjectionTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:injectionContext2.xml");
		
		Shop shop1 = ctx1.getBean("shop1", Shop.class); // (불러올 클래스 , 참조 클래스)
		System.out.println("shop1 : " + shop1.toString());
		
		Shop shop2 = (Shop) ctx1.getBean("shop2", Shop.class); // (불러올 클래스 , 참조 클래스)
		System.out.println("shop2: " + shop2.toString());
		
		Shop shop3 = (Shop) ctx1.getBean("shop3", Shop.class); // (못 불러 올 경우 강제 형 변환)
		System.out.println("shop3 : " + shop3.toString());
	}

}
