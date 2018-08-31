package test.json;

import java.util.ArrayList;

import org.json.JSONArray;

import model.MemberVO;

public class TestJSONArray {
	public static void main(String[] args) {
		//JSONArray 생성 
		JSONArray json=new JSONArray();
		json.put("아이유");
		json.put("이준규");
		json.put("설현");
		System.out.println(json.toString());
		ArrayList<MemberVO> list=new ArrayList<MemberVO>();
		list.add(new MemberVO("java","이준규","판교"));
		list.add(new MemberVO("angel","설현","수원"));
		JSONArray json2=new JSONArray(list);
		System.out.println(json2.toString());
		//JSONArray 안에 JSONObject가 2개가 요소로 들어있다 
		//[{"address":"판교","name":"이준규","id":"java"},{"address":"수원","name":"설현","id":"angel"}]
	}
}















