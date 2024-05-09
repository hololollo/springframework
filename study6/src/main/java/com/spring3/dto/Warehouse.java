package com.spring3.dto;

import java.util.Map;

public class Warehouse {
	private Map<String, Object> map; // key , value
	public Warehouse() {}
	public Warehouse(Map<String, Object> map) {
		super();
		this.map = map;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Store [map=" + map + "]";
	}
}