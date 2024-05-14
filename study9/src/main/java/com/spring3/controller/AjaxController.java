package com.spring3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring3.service.SampleService;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	private static final Logger log = LoggerFactory.getLogger(AjaxController.class);
	
	@Autowired
	private SampleService sampleService;
	
	/* /ajax로 시작하는 모든 요청에 대해 처리하며, 루트 경로(/)로 들어오는 GET 요청에 대해서는 "ajax/home.jsp" 뷰를 렌더링합니다. */
	
	@GetMapping("/") // 루트 만들기.
	public String ajaxHome() {
		return "ajax/home";
	}
	
	@GetMapping("/ajax1.do")
	public String ajaxTest1() {
		return "ajax/ajax1";
	}
	@ResponseBody // 이것만 json으로 응답한다 는 뜻
	@GetMapping(value="/ajax1pro.do", produces="application/json; charset=UTF-8")
	public String ajaxTest1Pro() {
		String str= "GET 전송 테스트"; // 다만 불러올 타입이 String이라서 출력은 되지만 "실패"가 된다.
		log.info(str);
		return str;
	}
	@GetMapping("/ajax2.do")
	public String ajaxTest2() {
		return "ajax/ajax2";
	}
	@ResponseBody // 이것만 json으로 응답한다 는 뜻
	@PostMapping(value="/ajax2pro.do", produces="application/json; charset=UTF-8")
	public String ajaxTest2Pro()  {
		String str = "Post 전송 테스트";
		log.info(str);
		return "ajax/ajax2";
		/*
		public JSONObject ajaxTest2Pro() throws ParseException {
		String jsonStr = "{\"str\" : "+ str + "}";
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(jsonStr);
		JSONObject jsonObj = (JSONObject) obj;
		log.info(str);
		return jsonObj;
		*/
	}
	@GetMapping("/ajax3.do")
	public String ajaxTest3() {
		return "ajax/ajax3";
	}
	@GetMapping("/ajax3pro.do") // 매개변수(파라미터) 넣음
	public String ajaxTest3Pro(@RequestParam("msg") String msg)  {
		log.info(msg);
		return "ajax/ajax3";
	}
	@GetMapping("/ajax4.do")
	public String ajaxTest4() {
		return "ajax/ajax4";
	}
	@PostMapping("/ajax4pro.do") 
	public String ajaxTest4Pro(@RequestParam("msg") String msg)  {
		log.info(msg);
		return "ajax/ajax4";
	}
	
}
