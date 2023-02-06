package com.simple.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.service.BoardService;
import com.simple.command.BoardVO;

@Controller
@RequestMapping("/service")
public class BoardServiceController {

	@Autowired
	@Qualifier("boardservice")
	private BoardService boardservice;
	
	//boardRegister화면출력
	@RequestMapping("/boardRegister")
	public String registView() {		
		return "service/boardRegister";
	}
	
	//등록기능 - 등록후 result창으로 
	@RequestMapping(value= "/addBoard", method = RequestMethod.POST)
	public String regist(BoardVO vo) {
		boardservice.boardRegist(vo);
		
		return "service/boardResult";
	}
	
	
	//list화면 출력
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = boardservice.getList();
		model.addAttribute("list", list);
		
		return "service/boardList";
	}

	//delet기능
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num) {
		boardservice.boardDelete(num);
		
		return "redirect:/service/boardList";
	}
	
}
