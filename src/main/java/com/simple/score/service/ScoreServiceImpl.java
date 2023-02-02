package com.simple.score.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.score.dao.ScoreDAO;

//@Service //@Component//@Repository//@Controller
@Service("xxx")//빈의 이름명시
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	@Qualifier("yyy")
	private ScoreDAO scoreDAO;
	
	
	
	@Override
	public void regist(ScoreVO vo) {		
		 scoreDAO.regist(vo);
	     System.out.println(vo.toString());
	}
	
	//dao에 입력된 리스트 가져와서 컨트롤러로 보내줌
	@Override 
	public ArrayList<ScoreVO> getList() {
		
		ArrayList<ScoreVO> list = scoreDAO.getList();
		
		return list;
	}
	
	//삭제기능
	@Override
	public void delete(int num) {
			scoreDAO.delete(num);
		
	}
	
}
