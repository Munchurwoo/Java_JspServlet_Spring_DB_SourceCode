package com.javalec.ex;

public class Pencil6BWithEraser extends Pencil6B implements Pencil {

	@Override
	public void use() {
//		super.use();
		
		System.out.println("6B굵기로 쓰이고, 지우개가 있습니다.");
		
	}
	
}
