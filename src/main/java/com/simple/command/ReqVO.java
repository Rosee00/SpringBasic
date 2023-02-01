package com.simple.command;

import java.util.List;

public class ReqVO {

	private String name;
	private int age;
	private List<String> inter;
	
	//기본생성자
	public ReqVO() {
		
	}

	//이거...뭐지...
	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}


	//멤버변수를 받는 생성자
	public ReqVO(String name, int age, List<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}

	//get,set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getInter() {
		return inter;
	}

	public void setInter(List<String> inter) {
		this.inter = inter;
	}
	
	
	
	
	
	
	
}
