package com.spring3.dto;

public class Shop {
	private String shopName;
	private Product product; // implements 역할이라고 보자. Shop객체가 Product 객체에 의존성이 있다고 표현
	public Shop() {}
	public Shop(String shopName, Product product) {
		super();
		this.shopName = shopName;
		this.product = product;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Shop [shopName=" + shopName + ", product=" + product + "]";
	}
	
}
