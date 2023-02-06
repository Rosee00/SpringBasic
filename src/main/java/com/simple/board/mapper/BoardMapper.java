package com.simple.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;

@Mapper //Mapper어노테이션을 꼭 붙일 필요는 없지만 쉬운 구별을 위해 붙여주는 것이 좋음
public interface BoardMapper {
	public void regist(BoardVO vo);
	public ArrayList<BoardVO> getList();
	public void delete(int num);

}
