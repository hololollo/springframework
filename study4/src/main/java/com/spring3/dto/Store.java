package com.spring3.dto;

public class Store {
	private int storeNum;
	private String storeName;
	public Store() {} // no argument 생성자
	public Store(int storeNum, String storeName) { // all argument 생성자
		super();
		this.storeNum = storeNum;
		this.storeName = storeName;
	}
	public int getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public String toString() {
		return "Store [storeNum=" + storeNum + ", storeName=" + storeName + "]";
	}
	
	
}
