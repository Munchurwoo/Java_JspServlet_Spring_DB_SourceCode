package test.json;

import org.json.JSONObject;

import model.CarDTO;

public class TestJSONObject {
	public static void main(String[] args) {
		JSONObject json1=new JSONObject();
		json1.put("name", "아이유");
		json1.put("age", 26);
		System.out.println(json1.toString());
		CarDTO dto=new CarDTO("BMW",200);
		JSONObject json2=new JSONObject(dto);
		System.out.println(json2.toString());
	}
}










