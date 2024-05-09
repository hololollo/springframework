package com.spring3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring3.dto.Store;
import com.spring3.service.StoreService;
import com.spring3.vo.Maker;

/*
REST(Representation State Transfer) : 표현 가능한 자원의 상태를 전송 => ex)쓸수있는 자원을 가져와서 가공하여 사용하는.
RESTful : 표현 가능한 자원의 상태를 자유롭게 전송할 수 있는
API : 프로그래밍시에 활용할 수 있는 어플리케이션 형태의 자원
RESTfulAPI (Application Programming Interface of Representation State Transfer)
*/
@RestController // @ResponseBody + @Controller : JSON으로 출력
@RequestMapping("/api/")
public class RestfulController {
	
	@Autowired
	private StoreService storeService;
	//json 출력
	@GetMapping("api1.do")
	public int getApi1() {
		return 1004;
	}
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1, "EmArt");
		return store;
	}
	@GetMapping("api3.do")
	public List<Store> getApi3() {
		Store store1 = new Store(1, "EmArt");
		Store store2 = new Store(2, "HomePlus");
		Store store3 = new Store(3, "Costco");
		List<Store> storelist = new ArrayList<>();
		storelist.add(store1);
		storelist.add(store2);
		storelist.add(store3);
		return storelist;
	}
	@GetMapping("api4.do")
	public Maker getApi4() {
		Store store1 = new Store(1, "EmArt");
		Store store2 = new Store(2, "HomePlus");
		Store store3 = new Store(3, "Costco");
		ArrayList<Store> storelist = new ArrayList<>();
		storelist.add(store1);
		storelist.add(store2);
		storelist.add(store3);
		Maker maker = new Maker("gratemall", 1, storelist);
		return maker;
	}

	
	//RequestBody : 자바스크립트의 객체 / json으로 받는다.
	@PostMapping("api5.do")
	public Store getApi5(@RequestBody Store store) {
		storeService.insStore(store);
		//Store를 json타입으로 만들어줌.
		return store;
	}
}
