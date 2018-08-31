package org.kosta.controller;

public class Test {
	public static void main(String[] args) {
		String str=" redirect:register_member_result.jsp";
		System.out.println(str.trim().startsWith("redirect:"));
		System.out.println(str.trim().substring(9));
	}
}
