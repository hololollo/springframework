package com.spring3.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring3.dto.Market;
import com.spring3.dto.Shop;
import com.spring3.dto.Store;

@Service // => 어노테이션 : 사용자가 만든 것으로 사용할 경우. (서비스, 컨트롤러, 레포지토리)
public class InjectionAnnotationTest1 {
	@Autowired
	private InjectionAnnotation1 obj1; // 어디에서는 설정이 되어야 한다 -> xml파일
	
	@Autowired
	private InjectionAnnotation2 obj2;
	
	@Autowired
	private InjectionAnnotation3 obj3;
	
	@Autowired
	private InjectionAnnotation4 obj4;
	
	public Store getStore() {
		return obj1.getStoreBean1();
	}
	public Shop getShop() {
		return obj2.getShopBean1();
	}
	public Market getMarket() {
		return obj3.getMarketBean1();
	}	
	public int getData1() {
		return obj4.getData1();
	}
}
