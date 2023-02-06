package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

@Mapper //마이바티스 매퍼를 지칭 -(스프링에서는 생략가능) 
public interface TestMapper {

	public String getTime(); //1	
	public ArrayList<ScoreVO> getScore(); // select (매개변수없고, 반환있음)
	public ScoreVO getOne(int a); //단일값
	
	public int insertOne(String name); //다중값
	public int insertTwo(ScoreVO vo); //다중값
	public int insertThree(Map<String, String> map); //다중값
	
	public Map<String, Object> selectMap(int num); //10번 키값 조회 //1행을 반환받음..?
	public ArrayList<Map<String, Object>> selectTwo(); //맵을 통한 다중행 조회 (제네릭안에 map타입)
	
	public boolean updateOne(ScoreVO vo); //update (9번 업데이트)
	
	public void insertFour(@Param("변수명1") String name, @Param("변수명2") int kor); //매개변수가 2개가 되면 에러
	
}
