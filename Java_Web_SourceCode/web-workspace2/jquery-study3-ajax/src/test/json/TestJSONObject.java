package test.json;

import org.json.JSONObject;

import model.CarDTO;

public class TestJSONObject {
	public static void main(String[] args) {
		JSONObject json1=new JSONObject();
		json1.put("nick", "공유");
		json1.put("address", "수원");
		System.out.println(json1.toString());
		CarDTO dto=new CarDTO("bmw",200);
		//DTO , VO 와 같은 일반객체를 JSON Object로 
		//변환하기 위해 생성자에 할당한다 
		JSONObject json2=new JSONObject(dto);
		System.out.println(json2.toString());
	}
}











