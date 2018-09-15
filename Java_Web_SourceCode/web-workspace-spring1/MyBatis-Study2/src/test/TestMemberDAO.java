package test;

import java.util.HashMap;
import java.util.List;

import org.kosta.model.MemberVO;

import model.MemberDAO;

public class TestMemberDAO {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();
		//1. 아이디로 검색 
		/*String id ="java";
		MemberVO vo  = dao.findMemberById(id);
		System.out.println(vo); //vo or null
		 */	
		
		//2. 회원 정보를 INSERT 
		//	  다수의 정보(회원정보)를 전달할 때에는 vo or map 을 이용한다. 
		
		/*MemberVO paramVO = new MemberVO("jdbc", "1", "김태리", "판교");
		dao.insertMember(paramVO);
		System.out.println("insert ok:"+dao.findMemberById(paramVO.getId()));*/
		
		//3. 총회원수를 select 
		
		/*int totalCount=dao.getMemberTotalCount();
		System.out.println("총회원수 : "+totalCount);*/
		
		//4. 전체 회원리스트를 select 
		/*
		 * hint : DAO 의 session.selectList(sql id);
		 * mapper(member.xml) 의 resultType 은 memberVO
		 * resultType 은 한 row의 정보를 어떻게 만들것인가 
		 */
		/*List<MemberVO> list = dao.getAllMemberList();
		for(MemberVO vo : list)
		
			System.out.println(vo);*/
		
		//5. 아이디로 회원검색 (검색결과를 VO 가 아니라 MAP 으로 반환 )
		
		/*Map<String, String> map = dao.findMemberMapById("java");
		System.out.println(map);*/
		
		//6. 회원 정보를 vo가 아니라 map 으로 전달 
		/*HashMap<String, String> paramMap=new HashMap<String,String>();
		paramMap.put("ID", "aa");
		paramMap.put("PASS", "1");
		paramMap.put("NAME", "문철우");
		paramMap.put("ADDR", "판교");
		
		dao.insertMemberByMap(paramMap);
		System.out.println("insert ok:"+dao.findMemberById(paramMap.get("ID")));*/
		
		//7. 주소 종류 리스트 조회 
		/*List<String> list = dao.getAddressKind();
		for(String addr:list)
			System.out.println(addr);*/
		
		//8. 검색 (name 과 address 가 일치하는 회원 리스트 )
		/*String name="강동원";
		String address="판교";
		MemberVO param = new MemberVO();
		param.setName(name);
		param.setAddress(address);
		List<MemberVO> list = dao.findMemberListByNameAndAddress(param);
		
		for(MemberVO vo : list)
			System.out.println(vo);*/
		
		// 9 . 전체 회원 정보를 Map으로 반환 
		// map 의 key 는 primary key 인 id 로 할당하고 
		// map 의 value는 MemberVO 객체로 할당 
		/*Map<String, MemberVO> map = dao.findMemberMap();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key:"+key+"value:"+map.get(key));
		}*/
		
		// 10. 회원 정보 수정 
		/*String name = "강동원";
		String address = "하와이";
		MemberVO vo = new MemberVO(null,null,name,address);
		dao.updateMember(vo);
		List<MemberVO> list = dao.findMemberListByNameAndAddress(vo);
		for(MemberVO rvo : list)
			System.out.println(rvo);*/
		
		// 11. 회원정보 삭제 
		String address = "하와이";
		String name = "강동원";
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ADDR", address);
		map.put("NAME",name);
		int result = dao.deleteMemberByAddressAndName(map);
		System.out.println("삭제된 회원 수 "+result+"명");
	}
}
