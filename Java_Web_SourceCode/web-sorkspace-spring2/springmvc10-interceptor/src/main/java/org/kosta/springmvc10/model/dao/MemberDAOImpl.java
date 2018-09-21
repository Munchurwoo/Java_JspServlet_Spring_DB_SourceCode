package org.kosta.springmvc10.model.dao;

import javax.annotation.Resource;

import org.kosta.springmvc10.model.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Resource
	private SqlSessionTemplate template;
	@Override
	public MemberVO login(MemberVO memberVO) {
		
		return template.selectOne("member.login",memberVO);
	}
	@Override
	public void updateMember(MemberVO memberVO) {
	}
	@Override
	public MemberVO findMemberById(String id) {
		
		return template.selectOne("member.findMemberById",id);
	}

}
