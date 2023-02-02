package com.simple.score.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("yyy")
public class ScoreDAOImpl implements ScoreDAO {

	//데이터베이스
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	
	@Override
	public void regist(ScoreVO vo) {

		//System.out.println("DAO영역:" + vo.toString());
		list.add(vo);
		System.out.println(list.toString());	
		
	}
	
	//리스트화면에 띄우기
	@Override
	public ArrayList<ScoreVO> getList() {
		
		//데이터조회...
		
		return list;
	}
	
	//삭제기능추가
	@Override
	public void delete(int num) {
		//삭제작업..
		list.remove(num);
		
	}
}
