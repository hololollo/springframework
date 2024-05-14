package com.spring3.dto;

import java.util.List;

public class Market {
	private String MarketName;
	private List<Goods> goodsList;
	
	//기본생성자를 안만들었으면 자동으로 있다고 인식한다.
	
	public String getMarketName() {
		return MarketName;
	}
	public void setMarketName(String marketName) {
		MarketName = marketName;
	}
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	@Override
	public String toString() {
		return "Market [MarketName=" + MarketName + ", goodsList=" + goodsList + "]";
	}
	
	
}
