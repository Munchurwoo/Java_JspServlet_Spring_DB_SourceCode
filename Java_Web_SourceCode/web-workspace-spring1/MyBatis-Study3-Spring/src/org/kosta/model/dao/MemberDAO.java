package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;

public class MemberDAO {
	private SqlSessionTemplate template;
	public MemberDAO(SqlSessionTemplate template) {
		super();
		this.template = template;
	}
	public MemberVO findMemberById(String id) {
		return template.selectOne("member.findMemberById",id);
	}
	public List<MemberVO> getAllMemberList(){
		return template.selectList("member.getAllMemberList");
		
	}
}
