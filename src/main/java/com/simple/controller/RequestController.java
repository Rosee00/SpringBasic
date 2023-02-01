package com.simple.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller //빈으로 생성
@RequestMapping("/request") //메서드 앞에 공통으로 들어가는 요청경로
public class RequestController {
	
	//String메서드 - 출력 화면을 직접지정
	
	//@RequestMapping("/ex01") //요청경로 
	//public String ex01() { 
	//return "request/ex01"; //출력경로 }

	
	//void메서드 - 요청경로가 출력경로가 됨
	@RequestMapping("/ex01")
	public void ex01() {}
	
	
	//get만 허용
	//@RequestMapping(value="/basic1", method = RequestMethod.GET )
	@GetMapping("/basic1")
	public String basic1() {
		
		System.out.println("get만 허용");
		
		return null;
	}
	
	//post만 허용
	//@RequestMapping(value="basic2", method = RequestMethod.POST)
	@PostMapping("/basic2")
	public String basic2() {
		
		System.out.println("post만 허용");
		
		return null;
	}
	
	//get, post 둘다 허용
	@RequestMapping("basic3")
	public String basic3() {
		
		return null;
	}
	
	
	//////////////////
	
	//ex02 화면요청
	@RequestMapping("/ex02")
	public String ex02() {
		
		return "request/ex02";
	}
	
	//1st
//	@RequestMapping(value="/doAction", method=RequestMethod.POST)
//	public String doAction(HttpServletRequest request ) {
//		
//		//name 파람
//		String name = request.getParameter("name");
//		//age 파람
//		String age = request.getParameter("age");
//		//inter - checkbox
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(Arrays.toString(inter));
//		
//		return "request/ex02_ok";
//		
//	}
	
	
	//2nd
//	@RequestMapping(value="/doAction")
//	public String doAction(@RequestParam(value="name", required= false, defaultValue = "") String name, 
//						   @RequestParam("age") int age, 
//						   @RequestParam(value="inter", required = false, defaultValue="" ) List<String> list) {
//		
//		//requestParam은 공백과 null데이터가 전달되면 요청을 거절하게 됩니다.
//		//필수가 아닌 파라미터는 required=false 속성을 지정하면 됩니다.
//		//필수가 아닌 파라미터인 경우에는 null or ""을 지정하게 되는데 defaultValue으로 기본값을 지정할 수 있습니다.
//		
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(list.toString());
//		
//		return "request/ex02_ok";
//	}
	

	//3rd - 커멘드 객체를 통해서 맴핑 (넘어오는 데이터의 name과 setter명이 같아야 한다)
	
//	@RequestMapping("/doAction")
//	public String doAction(ReqVO vo) {
//		
//		System.out.println(vo.toString());
//		
//		return "request/ex02_ok";
//		
//	}

	
	
	
	//실습
	//1st
	//1.req_quiz01 화면 띄우기
	@RequestMapping("/login")
	public String req_quiz01() {
		return "request/req_quiz01";
	}
	
	//2.폼 전송을 처리하는 메서드 생성(login맵핑 - POST만 허용)
//	@RequestMapping(value="/req_quiz01", method=RequestMethod.POST)
//	public String req_quiz01(HttpServletRequest req) {
//		
//		String id = req.getParameter("id");
//		String pw = req.getParameter("pw");
//		
//		
//		if(id.equals("abc123") && pw.equals("xxx123")) {
//			return "request/req_quiz01_ok";
//		} else{
//			return "request/req_quiz01_no"; 
//		}
//		
//	}
	
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String req_quiz01(@RequestParam(value="id", required = false, defaultValue = "")String id,
		  					 @RequestParam(value="pw", required= false, defaultValue = "") String pw) {
		
		if(id.equals("abc123") && pw.equals("xxx123")) {			
			return "request/req_quiz01_ok";
		}else {
			return "request/req_quiz01_no"; 
		}
 	}
	

	
	
	
}
