package com.simple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	//quiz01화면
	@RequestMapping("/quiz01")
	public String quiz01() {		
		return "quiz/quiz01";
	}
	
	//quiz01데이터 처리
	@RequestMapping("/sendBirth")
	public String sendBirth(@ModelAttribute("data") Quiz01VO vo) {
		
		System.out.println(vo.toString());
				
		return "quiz/quiz01_ok";
	}
	
	//quiz02화면
	@RequestMapping("/quiz02")
	public String quiz02() {		
		return "quiz/quiz02";
	}
	
	//quiz02데이터
//	@RequestMapping(value="/join", method = RequestMethod.POST )
//	public String join(HttpServletRequest data, Model m) {
//		
//		String id = data.getParameter("id");
//		String pw = data.getParameter("pw");
//		String name = data.getParameter("name");
//		String email = data.getParameter("email");
//		
//		m.addAttribute("id", id);
//		m.addAttribute("pw", pw);
//		m.addAttribute("name", name);
//		m.addAttribute("email", email);
//		
//		return "quiz/quiz02_ok";
//	}
	//quiz02데이터
		@RequestMapping(value="/join", method = RequestMethod.POST )
		public String join(@ModelAttribute("id") String id,
						   @ModelAttribute("pw") String pw,
						   @ModelAttribute("name") String name,
						   @ModelAttribute("email") String email) {
			
			return "quiz/quiz02_ok";
		}

	
	//quiz03화면
	@RequestMapping("/quiz03")
	public void quiz03() {	}
	
	
	@RequestMapping(value="/join2", method = RequestMethod.POST)
	public String join2(@RequestParam(value="id") String id,
						@RequestParam(value="pw") String pw,
						@RequestParam(value="pw_check") String pw_check,
						RedirectAttributes ra,
						Model m) {

		
		if(id.equals("")) {
			ra.addFlashAttribute("msg", "아이디를 입력하세요");
			return "redirect:/quiz/quiz03";
		} else if(!pw.equals(pw_check)) {
			ra.addFlashAttribute("msg", "비밀번호를 확인하세요");
			return "redirect:/quiz/quiz03";
		} else {			
			m.addAttribute("id", id);		
			return "quiz/quiz03_ok";
		}
		
		
	}
	
	
	
}
